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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeAdAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements YMANativeAd/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("adType")
    public YMANativeAdType getAdType() { return null; }
    @NotImplemented("delegate")
    public YMANativeAdDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(YMANativeAdDelegate v) {}
    @NotImplemented("info")
    public String getInfo() { return null; }
    @NotImplemented("ads")
    public NSArray<?> getAds() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("adAssets")
    public YMANativeAdAssets adAssets() { return null; }
    @NotImplemented("loadImages")
    public void loadImages() {}
    @NotImplemented("addImageLoadingObserver:")
    public void addImageLoadingObserver(YMANativeAdImageLoadingObserver observer) {}
    @NotImplemented("removeImageLoadingObserver:")
    public void removeImageLoadingObserver(YMANativeAdImageLoadingObserver observer) {}
    @NotImplemented("bindWithAdView:error:")
    public boolean bindWithAdView$error$(YMANativeAdView adView, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("bindAdToView:viewData:error:")
    public boolean bindAdToView$viewData$error$(UIView view, YMANativeAdViewData viewData, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("bindAdToSliderView:error:")
    public boolean bindAdToSliderView$error$(YMANativeAdView sliderView, NSError.NSErrorPtr error) { return false; }
    /*</methods>*/
}
