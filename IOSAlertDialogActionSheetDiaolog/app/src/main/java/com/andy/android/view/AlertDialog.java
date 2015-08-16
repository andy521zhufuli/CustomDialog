package com.andy.android.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.andy.android.R;

/**
 * Created by andy on 15/8/16.
 */
public class AlertDialog
{
    private Context context;
    private Dialog dialog;
    private Display display;
    private LinearLayout lLayout_bg;
    private TextView alertdialog_title_textview;
    private TextView alertdialog_msg_textview;
    private Button alertdialog_negtive_button;
    private Button alertdialog_positive_button;
    private ImageView alertdialog_line_between_pos_neg_imageview;

    private boolean showTitle = false;
    private boolean showMsg = false;
    private boolean showPosBtn = false;
    private boolean showNegBtn = false;

    public AlertDialog(Context context) {
        this.context = context;
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //拿到屏幕的宽高
        display = windowManager.getDefaultDisplay();

    }

    public AlertDialog builder()
    {
        //获取Dialog的布局
        View view = LayoutInflater.from(context).inflate(R.layout.view_alertdiaolog,null);

        //获取自定义Dialog布局中的控件
        lLayout_bg = (LinearLayout) view.findViewById(R.id.lLayout_bg);

        alertdialog_title_textview = (TextView) view.findViewById(R.id.alertdialog_title_textview);
        alertdialog_title_textview.setVisibility(View.GONE);

        alertdialog_msg_textview = (TextView) view.findViewById(R.id.alertdialog_msg_textview);
        alertdialog_msg_textview.setVisibility(View.GONE);

        alertdialog_negtive_button = (Button) view.findViewById(R.id.alertdialog_negtive_button);
        alertdialog_negtive_button.setVisibility(View.GONE);

        alertdialog_positive_button = (Button) view.findViewById(R.id.alertdialog_positive_button);
        alertdialog_positive_button.setVisibility(View.GONE);

        alertdialog_line_between_pos_neg_imageview = (ImageView) view.findViewById(R.id.alertdialog_line_between_pos_neg_imageview);
        alertdialog_line_between_pos_neg_imageview.setVisibility(View.GONE);

        //定义Dialog布局  参数
        dialog = new Dialog(context, R.style.AlertDialogStyle1);
        dialog.setContentView(view);
        //Dialog背景大小 宽度略小于屏幕
        lLayout_bg.setLayoutParams(new FrameLayout.LayoutParams((int)(display.getWidth() * 0.85), FrameLayout.LayoutParams.WRAP_CONTENT));
        return this;
    }

    /**
     * 设置标题
     * @param title
     * @return
     */
    public AlertDialog setTitle(String title)
    {
        showTitle = true;
        if ("".equals(title))
        {
            alertdialog_title_textview.setText("标题");
        }
        else
        {
            alertdialog_title_textview.setText(title);
        }
        return this;
    }

    /**
     * 设置内容
     * @param msg
     * @return
     */
    public AlertDialog setMsg(String msg)
    {
        showMsg = true;
        if ("".equals(msg))
        {
            alertdialog_msg_textview.setText("内容");
        }
        else
        {
            alertdialog_msg_textview.setText(msg);
        }
        return this;
    }

    /**
     * 是否可取消
     * @param cancel
     * @return
     */
    public AlertDialog setCancelable(boolean cancel)
    {
        dialog.setCancelable(cancel);
        return this;
    }

    /**
     * positive 按钮
     * @param text
     * @param listener
     * @return
     */
    public AlertDialog setPositiveButton(String text, final View.OnClickListener listener)
    {
        showPosBtn = true;
        if ("".equals(text))
        {
            alertdialog_positive_button.setText("确定");
        }
        else
        {
            alertdialog_positive_button.setText(text);
        }
        alertdialog_positive_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(v);
                dialog.dismiss();
            }
        });
        return this;
    }

    /**
     * negative 按钮
     * @param text
     * @param listener
     * @return
     */
    public AlertDialog setNegativeButton(String text, final View.OnClickListener listener)
    {
        showNegBtn = true;
        if ("".equals(text))
        {
            alertdialog_negtive_button.setText("取消");
        }
        else
        {
            alertdialog_negtive_button.setText(text);
        }
        alertdialog_negtive_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                listener.onClick(v);
                dialog.dismiss();
            }
        });
        return this;
    }

    /**
     * 设置布局
     */
    private void setLayout()
    {
        if (!showTitle && !showMsg)
        {
            alertdialog_title_textview.setText("提示");
            alertdialog_title_textview.setVisibility(View.VISIBLE);
        }

        if (showTitle)
        {
            alertdialog_title_textview.setVisibility(View.VISIBLE);
        }

        if (showMsg)
        {
            alertdialog_msg_textview.setVisibility(View.VISIBLE);
        }

        if (!showPosBtn && !showNegBtn)
        {
            alertdialog_positive_button.setText("确定");
            alertdialog_positive_button.setVisibility(View.VISIBLE);
            alertdialog_positive_button.setBackgroundResource(R.drawable.alertdialog_single_selector);
            alertdialog_positive_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //这里也可以定制 不一定非要是取消
                    dialog.dismiss();
                }
            });
        }
        if (showPosBtn && showNegBtn)
        {
            alertdialog_positive_button.setVisibility(View.VISIBLE);
            alertdialog_positive_button.setBackgroundResource(R.drawable.alertdialog_right_selector);
            alertdialog_negtive_button.setVisibility(View.VISIBLE);
            alertdialog_negtive_button.setBackgroundResource(R.drawable.alertdialog_left_selector);
            alertdialog_line_between_pos_neg_imageview.setVisibility(View.VISIBLE);
        }

        if (showPosBtn && !showNegBtn)
        {
            alertdialog_positive_button.setVisibility(View.VISIBLE);
            alertdialog_positive_button.setBackgroundResource(R.drawable.alertdialog_single_selector);
        }

        if (!showPosBtn && showNegBtn)
        {
            alertdialog_negtive_button.setVisibility(View.VISIBLE);
            alertdialog_negtive_button.setBackgroundResource(R.drawable.alertdialog_single_selector);
        }
    }

    public void show()
    {
        setLayout();
        dialog.show();
    }



}
