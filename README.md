#####Spring Session サンプルコードの検証
* 本家ソースコードは[こちら](https://github.com/spring-projects/spring-session/tree/master/samples/httpsession-xml)
* DispatcherServletとの併用を検証中
* 検証にはRedisが必要です。

#####Redis設定
* インストール(Mac)、サーバー起動、クライアント起動
```
# brew install redis
# redis-server /usr/local/etc/redis.conf
# redis-cli > monitor
```
