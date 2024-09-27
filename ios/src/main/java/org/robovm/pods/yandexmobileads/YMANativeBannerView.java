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
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeBannerView/*</name>*/
    extends /*<extends>*/UIView/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMANativeBannerViewPtr extends Ptr<YMANativeBannerView, YMANativeBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMANativeBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMANativeBannerView() {}
    protected YMANativeBannerView(Handle h, long handle) { super(h, handle); }
    protected YMANativeBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public YMANativeBannerView(@ByVal CGRect frame) { super((SkipInit) null); initObject(initWithFrame$(frame)); }
    @Method(selector = "initWithCoder:")
    public YMANativeBannerView(NSCoder coder) { super((SkipInit) null); initObject(initWithCoder$(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ad")
    public native YMANativeAd getAd();
    @Property(selector = "setAd:")
    public native void setAd(YMANativeAd v);
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long initWithFrame$(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long initWithCoder$(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder coder);
    @Method(selector = "applyAppearance:")
    public native void applyAppearance(YMANativeTemplateAppearance appearance);
    @Method(selector = "heightWithAd:width:appearance:")
    public static native @MachineSizedFloat double heightWithAd$width$appearance$(YMANativeAd ad, @MachineSizedFloat double width, YMANativeTemplateAppearance appearance);
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
    /*</methods>*/
}
