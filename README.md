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

