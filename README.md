# RoboPods for Yandex Mobile Ads iOS

## Based on [RoboVM altpods by Demyan Kimitsa](https://github.com/dkimitsa/robovm-robopods)
[**bro-gen**](https://github.com/dkimitsa/robovm-bro-gen) -
[**bro-gen tutorial**](https://dkimitsa.github.io/2017/10/19/bro-gen-tutorial/) -
[**dkimitsa's dev blog**](https://dkimitsa.github.io/)

## Install Instructions

### 3rd party native frameworks
This RoboPod requires you to add the native frameworks:

* AppMetricaCore.framework
* AppMetricaCoreExtension.framework
* AppMetricaCoreUtils.framework
* AppMetricaCrashes.framework
* AppMetricaEncodingUtils.framework
* AppMetricaFMDB.framework
* AppMetricaHostState.framework
* AppMetricaLog.framework
* AppMetricaNetwork.framework
* AppMetricaPlatform.framework
* AppMetricaProtobuf.framework
* AppMetricaProtobufUtils.framework
* AppMetricaStorageUtils.framework
* DivKit.framework
* DivKitBinaryCompatibilityFacade.framework
* KSCrash.framework
* LayoutKit.framework
* LayoutKitInterface.framework
* Serialization.framework
* VGSL.framework
* VGSLFundamentals.framework
* VGSLNetworking.framework
* VGSLUI.framework
* YandexMobileAds.xcframework

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   implementation "io.github.promansew.robovm:robopods-yandexmobileads-ios:1.0.0-SNAPSHOT"
}
```
Project is not released on Maven, need to deploy repository project locally first.

## [Yandex Mobile Ads home page](https://github.com/yandexmobile/yandex-ads-sdk-ios)
