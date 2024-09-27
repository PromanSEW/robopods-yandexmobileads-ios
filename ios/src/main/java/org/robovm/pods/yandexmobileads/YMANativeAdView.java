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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMANativeAdViewPtr extends Ptr<YMANativeAdView, YMANativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMANativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMANativeAdView() {}
    protected YMANativeAdView(Handle h, long handle) { super(h, handle); }
    protected YMANativeAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public YMANativeAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public YMANativeAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ageLabel")
    public native UILabel getAgeLabel();
    @Property(selector = "setAgeLabel:")
    public native void setAgeLabel(UILabel v);
    @Property(selector = "bodyLabel")
    public native UILabel getBodyLabel();
    @Property(selector = "setBodyLabel:")
    public native void setBodyLabel(UILabel v);
    @Property(selector = "callToActionButton")
    public native UIButton getCallToActionButton();
    @Property(selector = "setCallToActionButton:")
    public native void setCallToActionButton(UIButton v);
    @Property(selector = "domainLabel")
    public native UILabel getDomainLabel();
    @Property(selector = "setDomainLabel:")
    public native void setDomainLabel(UILabel v);
    @Property(selector = "faviconImageView")
    public native UIImageView getFaviconImageView();
    @Property(selector = "setFaviconImageView:")
    public native void setFaviconImageView(UIImageView v);
    @Property(selector = "feedbackButton")
    public native UIButton getFeedbackButton();
    @Property(selector = "setFeedbackButton:")
    public native void setFeedbackButton(UIButton v);
    @Property(selector = "iconImageView")
    public native UIImageView getIconImageView();
    @Property(selector = "setIconImageView:")
    public native void setIconImageView(UIImageView v);
    @Property(selector = "mediaView")
    public native YMANativeMediaView getMediaView();
    @Property(selector = "setMediaView:")
    public native void setMediaView(YMANativeMediaView v);
    @Property(selector = "priceLabel")
    public native UILabel getPriceLabel();
    @Property(selector = "setPriceLabel:")
    public native void setPriceLabel(UILabel v);
    @Property(selector = "ratingView")
    public native UIView getRatingView();
    @Property(selector = "setRatingView:")
    public native void setRatingView(UIView v);
    @Property(selector = "reviewCountLabel")
    public native UILabel getReviewCountLabel();
    @Property(selector = "setReviewCountLabel:")
    public native void setReviewCountLabel(UILabel v);
    @Property(selector = "sponsoredLabel")
    public native UILabel getSponsoredLabel();
    @Property(selector = "setSponsoredLabel:")
    public native void setSponsoredLabel(UILabel v);
    @Property(selector = "titleLabel")
    public native UILabel getTitleLabel();
    @Property(selector = "setTitleLabel:")
    public native void setTitleLabel(UILabel v);
    @Property(selector = "warningLabel")
    public native UILabel getWarningLabel();
    @Property(selector = "setWarningLabel:")
    public native void setWarningLabel(UILabel v);
    @Property(selector = "ad")
    public native YMANativeAd getAd();
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
