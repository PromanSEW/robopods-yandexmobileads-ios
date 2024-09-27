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
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAAdViewPtr extends Ptr<YMAAdView, YMAAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAAdView() {}
    protected YMAAdView(Handle h, long handle) { super(h, handle); }
    protected YMAAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:adSize:")
    public YMAAdView(String adUnitID, YMABannerAdSize adSize) { super((SkipInit) null); initObject(initWithAdUnitID$adSize$(adUnitID, adSize)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "info")
    public native String getInfo();
    @Property(selector = "videoController")
    public native YMAVideoController getVideoController();
    @Property(selector = "delegate")
    public native YMAAdViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(YMAAdViewDelegate v);
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "intrinsicContentSize")
    public native @ByVal CGSize getIntrinsicContentSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:adSize:")
    protected native @Pointer long initWithAdUnitID$adSize$(String adUnitID, YMABannerAdSize adSize);
    @Method(selector = "displayAtTopInView:")
    public native void displayAtTopInView(UIView view);
    @Method(selector = "displayAtBottomInView:")
    public native void displayAtBottomInView(UIView view);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadAdWithRequest:")
    public native void loadAdWithRequest$(YMAAdRequest request);
    @Method(selector = "adContentSize")
    public native @ByVal CGSize adContentSize();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
    @Method(selector = "pointInside:withEvent:")
    public native boolean isPointInside(@ByVal CGPoint point, UIEvent event);
    /*</methods>*/
}
