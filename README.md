# EvaluationPDF
PDF Evaluation on Android (Android 平台上的 PDF 测评)



从多个纬度对 Android 的 PDF 加载做测评，重点考虑因素:

- 包体积增量大小
- 加载能力(远端、本地)
- 加载速度
- 易用性



测试文件: 个人服务器上的 test.pdf  大小为 1.4MB

测评方式: 以 master 分支上的分支为纯净分支，产生的空 apk 的大小为 1,357,576 字节(约1.4MB)，此后每测评一种新的支持 PDF 的能力都拉出一个新分支做代码接入以及计算包增量