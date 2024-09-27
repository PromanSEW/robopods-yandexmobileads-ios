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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeTemplateAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMANativeTemplateAppearancePtr extends Ptr<YMANativeTemplateAppearance, YMANativeTemplateAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMANativeTemplateAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMANativeTemplateAppearance() {}
    protected YMANativeTemplateAppearance(Handle h, long handle) { super(h, handle); }
    protected YMANativeTemplateAppearance(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "borderWidth")
    public native @MachineSizedFloat double getBorderWidth();
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "contentPadding")
    public native @ByVal YMAHorizontalOffset getContentPadding();
    @Property(selector = "imageMargins")
    public native @ByVal YMAHorizontalOffset getImageMargins();
    @Property(selector = "ageAppearance")
    public native YMALabelAppearance getAgeAppearance();
    @Property(selector = "bodyAppearance")
    public native YMALabelAppearance getBodyAppearance();
    @Property(selector = "callToActionAppearance")
    public native YMAButtonAppearance getCallToActionAppearance();
    @Property(selector = "domainAppearance")
    public native YMALabelAppearance getDomainAppearance();
    @Property(selector = "faviconAppearance")
    public native YMAImageAppearance getFaviconAppearance();
    @Property(selector = "feedbackAppearance")
    public native YMAImageAppearance getFeedbackAppearance();
    @Property(selector = "imageAppearance")
    public native YMAImageAppearance getImageAppearance();
    @Property(selector = "ratingAppearance")
    public native YMARatingAppearance getRatingAppearance();
    @Property(selector = "sponsoredAppearance")
    public native YMALabelAppearance getSponsoredAppearance();
    @Property(selector = "titleAppearance")
    public native YMALabelAppearance getTitleAppearance();
    @Property(selector = "reviewCountAppearance")
    public native YMALabelAppearance getReviewCountAppearance();
    @Property(selector = "warningAppearance")
    public native YMALabelAppearance getWarningAppearance();
    @Property(selector = "mutableAppearance")
    public native YMAMutableNativeTemplateAppearance getMutableAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated copy(with:) is deprecated. Will be removed in future versions.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    /**
     * @deprecated mutableCopy(with:) is deprecated. Use `mutableAppearance` property instead.
     */
    @Deprecated
    @Method(selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);
    @Method(selector = "defaultAppearance")
    public static native YMANativeTemplateAppearance defaultAppearance();
    /*</methods>*/
}
