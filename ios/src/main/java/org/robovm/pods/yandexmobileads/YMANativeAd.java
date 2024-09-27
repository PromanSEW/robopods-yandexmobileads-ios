/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.yandexmobileads;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/YMANativeAd/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "adType")
    YMANativeAdType getAdType();
    @Property(selector = "delegate")
    YMANativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:")
    void setDelegate(YMANativeAdDelegate v);
    @Property(selector = "info")
    String getInfo();
    @Property(selector = "ads")
    NSArray<?> getAds();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adAssets")
    YMANativeAdAssets adAssets();
    @Method(selector = "loadImages")
    void loadImages();
    @Method(selector = "addImageLoadingObserver:")
    void addImageLoadingObserver(YMANativeAdImageLoadingObserver observer);
    @Method(selector = "removeImageLoadingObserver:")
    void removeImageLoadingObserver(YMANativeAdImageLoadingObserver observer);
    @Method(selector = "bindWithAdView:error:")
    boolean bindWithAdView$error$(YMANativeAdView adView, NSError.NSErrorPtr error);
    @Method(selector = "bindAdToView:viewData:error:")
    boolean bindAdToView$viewData$error$(UIView view, YMANativeAdViewData viewData, NSError.NSErrorPtr error);
    @Method(selector = "bindAdToSliderView:error:")
    boolean bindAdToSliderView$error$(YMANativeAdView sliderView, NSError.NSErrorPtr error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
