---
layout: page
title: 欢迎
permalink: /:path/
sort_idx: 5
---

{% include variables.md %}

* TOC
{:toc}

欢迎阅读Kaa物联网平台文档!

Kaa是一个高度灵活的，多功能的，100%开源的中间件平台并实现了端到端的物联网的解决方案, 连接应用和智能产品。
简言之, Kaa 提供了一系列开箱即用的、企业级的物联网特性，使得它很容易嵌入同时也已经实现了大多数物关网使用案例。
这些平台特性包含设备管理, 数据收集, 配置管理, 消息通信等。
详细内容请看 [平台主要特性]({{root_url}}Programming-guide/Key-platform-features/)。

>**注意:** 你可以参考旧的Kaa文件 [对于 0.10.0 以前的版本](http://docs.kaaproject.org/display/KAA/Kaa+IoT+Platform+Home).
{: .note}

## 如何开始
想要快速了解Kaa物联网平台, 查看 [如何开始]({{root_url}}Getting-started/) 手册。
或者你可以 [在你自己的环境部署Kaa]({{root_url}}Administration-guide/System-installation/Single-node-installation/).

一旦你启动了并运行了一个Kaa实例, 参考 [你的第一个Kaa应用]({{root_url}}Programming-guide/Your-first-Kaa-application/)手册去学习基本的Kaa应用构建方法。
对于你的客户端程序, 你可以选择使用不同的编程语言和不同的平台构建一些实现 [Kaa终端SDK]({{root_url}}Programming-guide/Using-Kaa-endpoint-SDKs/) 。

Kaa平台架构参考[架构总览]({{root_url}}Architecture-overview/)。

## 如何获得帮助
如果你使用Kaa平台出现了问题, 参考[Troubleshooting手册]({{root_url}}Administration-guide/Troubleshooting/)。
如果你的问题还没解决，把你的问题发在[StackOverflow](http://stackoverflow.com/questions/tagged/kaa)。

## 如何贡献你的代码
参考[贡献手册]({{root_url}}How-to-contribute/) 去学习如何贡献你的代码给Kaa物联网平台。

你可以报告一些问题通过创建一个ticket参考[Kaa任务追踪](http://jira.kaaproject.org/browse/KAA/)。

## 许可
Kaa物联网平台遵循[Apache软件许可2.0](http://www.apache.org/licenses/LICENSE-2.0)。
详细内容请参考 [许可]({{github_url}}LICENSE)和[版权.txt]({{github_url}}copyright.txt) 。