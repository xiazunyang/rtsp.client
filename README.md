# rtsp.client #

原项目：[EasyPlayer-RTSP-Android](https://github.com/EasyDSS/EasyPlayer-RTSP-Android)

原项目的基础上，去除了x86架构的支持，并迁移至Androidx。

### 引入

1.  在你的android工程的根目录下的build.gradle文件中的适当的位置添加以下代码：
    ```groovy
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2.  在你的android工程中对应的android模块的build.gradle文件中的适当位置添加以下代码：
    ```groovy
    implementation 'cn.numeron:rtsp.client:1.0.0'
    ```

### 使用

    TextureView texture = findViewById(R.id.texture_view);
    String rtspUrl = "rtsp://admin:123456@192.168.1.107:554/";
    RtspClient client = new RtspClient(this, "custom key", textureView, null, null);
    client.play(BuildConfig.RTSP_URL);
