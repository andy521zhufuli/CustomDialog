# CustomDialog
## 整体效果如下
![Show](http://ww1.sinaimg.cn/large/9750cbe5gw1ev49kkdm0cg20cm0eywhj.gif)

## Button样式
### 首先,是Button的几种状态

- **enabled = false** 

``` 
	<?xml version="1.0" encoding="utf-8"?>
	<shape
    xmlns:android="http://schemas.android.com/apk/res/android">
    <corners
        android:radius="4.0dip"
        android:topLeftRadius="4.0dip"
        android:topRightRadius="4.0dip"
        android:bottomLeftRadius="4.0dip"
        android:bottomRightRadius="4.0dip" />
    <solid
        android:color="#fff0f0f0" />
</shape>
```

- **focused = true** 

``` 
	<shape
    xmlns:android="http://schemas.android.com/apk/res/android">
    <corners
        android:radius="4.0dip"
        android:topLeftRadius="4.0dip"
        android:topRightRadius="4.0dip"
        android:bottomLeftRadius="4.0dip"
        android:bottomRightRadius="4.0dip" />
    <solid android:color="#ffa83a3a" />
</shape>
```
- **pressed = true** 

``` 
	<?xml version="1.0" encoding="utf-8"?>
<shape
    xmlns:android="http://schemas.android.com/apk/res/android">
    <corners
        android:radius="4.0dip"
        android:topLeftRadius="4.0dip"
        android:topRightRadius="4.0dip"
        android:bottomLeftRadius="4.0dip"
        android:bottomRightRadius="4.0dip" />
    <solid android:color="#ffa83a3a" />
</shape>
```
- **normal** 

``` 
	<shape
    xmlns:android="http://schemas.android.com/apk/res/android">
    <corners
        android:radius="4.0dip"
        android:topLeftRadius="4.0dip"
        android:topRightRadius="4.0dip"
        android:bottomLeftRadius="4.0dip"
        android:bottomRightRadius="4.0dip" />
    <solid
        android:color="#fff15353" />
</shape>
```
### ALertDialog的样式
``` 
	自定义的仿IOS的AlertDialog的样式
    <style name="AlertDialogStyle" parent="@android:style/Theme.Dialog">
        <!-- 提示背景图片 背景透明 -->
        <item name="android:windowBackground">@android:color/transparent</item>
        <!-- 对话框是否有遮盖 没有遮盖 -->
        <item name="android:windowContentOverlay">@null</item>

        <!-- 对话框是否浮动 浮于Activity之上 -->
        <item name="android:windowIsFloating">true</item>

        <item name="android:windowFrame">@null</item>
        <!-- 是否允许背景灰暗  Dialog以外的区域模糊效果 -->
        <item name="android:backgroundDimEnabled">true</item>
        <!-- 是否允许有标题栏 没有标题 -->
        <item name="android:windowNoTitle">true</item>
        <!-- 对话框是否透明 半透明 -->
        <item name="android:windowIsTranslucent">true</item>
    </style>
```
只需要在Dialog里面设置就行了, 这个算是比较重要的,其他如AlertDialog的自定义view类,参考代码就行了  很容易懂
