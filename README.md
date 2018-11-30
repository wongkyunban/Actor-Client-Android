# Actor-Client-Android
基于Actor模型的即时通信Android客户端

In case of self hosted solution, the most important parameter is server endpoints. You can set them like this: 


```
ActorSDK.sharedActor().setEndpoints(new String[] {
		"tcp://93.184.216.34:9070"  //修改成你的Actor服务器地址
});
```
Endpoint is:
```
<schema>://<server address>:<port>
```
where:
 - schema: tcp or tls in case of secured connection
 - server address: your server ip/dns
 - port: your endpoint port
