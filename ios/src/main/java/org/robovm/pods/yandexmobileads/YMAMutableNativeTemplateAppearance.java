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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAMutableNativeTemplateAppearance/*</name>*/ 
    extends /*<extends>*/YMANativeTemplateAppearance/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAMutableNativeTemplateAppearancePtr extends Ptr<YMAMutableNativeTemplateAppearance, YMAMutableNativeTemplateAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAMutableNativeTemplateAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAMutableNativeTemplateAppearance() {}
    protected YMAMutableNativeTemplateAppearance(Handle h, long handle) { super(h, handle); }
    protected YMAMutableNativeTemplateAppearance(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "borderWidth")
    public native @MachineSizedFloat double getBorderWidth();
    @Property(selector = "setBorderWidth:")
    public native void setBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(UIColor v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "contentPadding")
    public native @ByVal YMAHorizontalOffset getContentPadding();
    @Property(selector = "setContentPadding:")
    public native void setContentPadding(@ByVal YMAHorizontalOffset v);
    @Property(selector = "imageMargins")
    public native @ByVal YMAHorizontalOffset getImageMargins();
    @Property(selector = "setImageMargins:")
    public native void setImageMargins(@ByVal YMAHorizontalOffset v);
    @Property(selector = "ageAppearance")
    public native YMALabelAppearance getAgeAppearance();
    @Property(selector = "setAgeAppearance:")
    public native void setAgeAppearance(YMALabelAppearance v);
    @Property(selector = "bodyAppearance")
    public native YMALabelAppearance getBodyAppearance();
    @Property(selector = "setBodyAppearance:")
    public native void setBodyAppearance(YMALabelAppearance v);
    @Property(selector = "callToActionAppearance")
    public native YMAButtonAppearance getCallToActionAppearance();
    @Property(selector = "setCallToActionAppearance:")
    public native void setCallToActionAppearance(YMAButtonAppearance v);
    @Property(selector = "domainAppearance")
    public native YMALabelAppearance getDomainAppearance();
    @Property(selector = "setDomainAppearance:")
    public native void setDomainAppearance(YMALabelAppearance v);
    @Property(selector = "faviconAppearance")
    public native YMAImageAppearance getFaviconAppearance();
    @Property(selector = "setFaviconAppearance:")
    public native void setFaviconAppearance(YMAImageAppearance v);
    @Property(selector = "feedbackAppearance")
    public native YMAImageAppearance getFeedbackAppearance();
    @Property(selector = "setFeedbackAppearance:")
    public native void setFeedbackAppearance(YMAImageAppearance v);
    @Property(selector = "imageAppearance")
    public native YMAImageAppearance getImageAppearance();
    @Property(selector = "setImageAppearance:")
    public native void setImageAppearance(YMAImageAppearance v);
    @Property(selector = "ratingAppearance")
    public native YMARatingAppearance getRatingAppearance();
    @Property(selector = "setRatingAppearance:")
    public native void setRatingAppearance(YMARatingAppearance v);
    @Property(selector = "sponsoredAppearance")
    public native YMALabelAppearance getSponsoredAppearance();
    @Property(selector = "setSponsoredAppearance:")
    public native void setSponsoredAppearance(YMALabelAppearance v);
    @Property(selector = "titleAppearance")
    public native YMALabelAppearance getTitleAppearance();
    @Property(selector = "setTitleAppearance:")
    public native void setTitleAppearance(YMALabelAppearance v);
    @Property(selector = "reviewCountAppearance")
    public native YMALabelAppearance getReviewCountAppearance();
    @Property(selector = "setReviewCountAppearance:")
    public native void setReviewCountAppearance(YMALabelAppearance v);
    @Property(selector = "warningAppearance")
    public native YMALabelAppearance getWarningAppearance();
    @Property(selector = "setWarningAppearance:")
    public native void setWarningAppearance(YMALabelAppearance v);
    @Property(selector = "appearance")
    public native YMANativeTemplateAppearance getAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated copy(with:) is deprecated. Use `appearance` property instead.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    @Method(selector = "defaultAppearance")
    public static native YMANativeTemplateAppearance defaultAppearance();
    /*</methods>*/
}
