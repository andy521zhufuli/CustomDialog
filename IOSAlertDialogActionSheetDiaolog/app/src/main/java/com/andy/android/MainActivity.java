package com.andy.android;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.andy.android.view.ActionSheetDialog;
import com.andy.android.view.AlertDialog;
import com.andy.android.view.AlertDialogModifyNum;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button alertdialog_with_one_button;     //AlertDialog 一个按钮
    private Button alertdialog_with_two_button;     //AlertDialog 两个按钮
    private Button actionsheetdialog_message;       //ActionSheetDialog 只显示一个Message
    private Button actionsheet_choose_pic;          //ActionSheetDialog 选择图片
    private Button actionsheet_dialog_list;         //ActionSheetDialog 一个列表
    private Button actionsheet_dialog_shoppingcar;//购物车加减商品数量
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mContext = this;

        findViews();
    }

    /**
     * 初始化控件
     */
    private void findViews() {
        alertdialog_with_one_button = (Button) findViewById(R.id.alertdialog_with_one_button);
        alertdialog_with_two_button = (Button) findViewById(R.id.alertdialog_with_two_button);
        actionsheetdialog_message = (Button) findViewById(R.id.actionsheetdialog_message);
        actionsheet_choose_pic = (Button) findViewById(R.id.actionsheet_choose_pic);
        actionsheet_dialog_list = (Button) findViewById(R.id.actionsheet_dialog_list);
        actionsheet_dialog_shoppingcar = (Button) findViewById(R.id.actionsheet_dialog_shoppingcar);

        //设置监听器
        alertdialog_with_one_button.setOnClickListener(this);
        alertdialog_with_two_button.setOnClickListener(this);
        actionsheetdialog_message.setOnClickListener(this);
        actionsheet_choose_pic.setOnClickListener(this);
        actionsheet_dialog_list.setOnClickListener(this);
        actionsheet_dialog_shoppingcar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            //一个按钮
            case R.id.alertdialog_with_one_button:
                oneButton();
                break;
            //两个按钮
            case R.id.alertdialog_with_two_button:
                twoButton();
                break;
            //消息
            case R.id.actionsheetdialog_message:
                actionsheet_message();
                break;
            //选择图片
            case R.id.actionsheet_choose_pic:
                actionsheetChoosePic();
                break;
            //一个列表
            case R.id.actionsheet_dialog_list:
                actionsheetList();
                break;
            case R.id.actionsheet_dialog_shoppingcar:
                shoppingcarGoodsNum();
                break;
        }
    }

    /**
     * 弹出一个list可供选择
     */
    private void actionsheetList() {
        new ActionSheetDialog(MainActivity.this)
                .builder()
                .setTitle("请选择操作")
                .setCancelable(false)
                .setCanceledOnTouchOutside(false)
                .addSheetItem("条目一", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目二", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目三", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目四", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目五", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目六", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目七", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目八", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目九", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("条目十", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }).show();
    }

    /**
     * 弹出选择图片 拍照还是从图库中选择
     */
    private void actionsheetChoosePic() {
        new ActionSheetDialog(MainActivity.this)
                .builder()
                .setTitle("请选择操作")
                .setCancelable(false)
                .setCanceledOnTouchOutside(false)
                .addSheetItem("从相册选取", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .addSheetItem("拍照", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,
                                        "item" + which, Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                .show();
    }

    /**
     * 弹出提示
     */
    private void actionsheet_message() {
        new ActionSheetDialog(MainActivity.this)
                .builder()
                .setTitle("清空消息列表后，聊天记录依然保留，确定要清空消息列表？")
                .setCancelable(false)
                .setCanceledOnTouchOutside(false)
                .addSheetItem("清空消息列表", ActionSheetDialog.SheetItemColor.Red,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();
    }

    /**
     * 修改购物车数量弹出的Dialog
     */
    private void shoppingcarGoodsNum() {
        new AlertDialogModifyNum(mContext, "10")
                .builder()
                .setConformButton("确定", new AlertDialogModifyNum.OnClickListener() {
                    @Override
                    public void onClick(View view, String goodnum) {
                        Toast.makeText(mContext, "Plus", Toast.LENGTH_LONG).show();
                    }
                })
                .setCancelable(false)
                .setCancelButton("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mContext, "Cancel", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }

    /**
     * 两个按钮的  dialog 确定取消
     */
    private void twoButton() {
        new AlertDialog(mContext).builder()
                .setTitle("").setMsg("确定退出吗?").setCancelable(false)
                .setPositiveButton("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .setNegativeButton("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                })
                .show();
    }

    /**
     * 一个按钮  取消 或者确定
     */
    private void oneButton() {
        new AlertDialog(mContext).builder()
                .show();
    }
}
