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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeAdAssets/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMANativeAdAssetsPtr extends Ptr<YMANativeAdAssets, YMANativeAdAssetsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMANativeAdAssets.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMANativeAdAssets() {}
    protected YMANativeAdAssets(Handle h, long handle) { super(h, handle); }
    protected YMANativeAdAssets(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "age")
    public native String getAge();
    @Property(selector = "setAge:")
    public native void setAge(String v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "setCallToAction:")
    public native void setCallToAction(String v);
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "setDomain:")
    public native void setDomain(String v);
    @Property(selector = "favicon")
    public native YMANativeAdImage getFavicon();
    @Property(selector = "setFavicon:")
    public native void setFavicon(YMANativeAdImage v);
    @Property(selector = "feedbackAvailable")
    public native boolean isFeedbackAvailable();
    @Property(selector = "setFeedbackAvailable:")
    public native void setFeedbackAvailable(boolean v);
    @Property(selector = "icon")
    public native YMANativeAdImage getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(YMANativeAdImage v);
    @Property(selector = "image")
    public native YMANativeAdImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(YMANativeAdImage v);
    @Property(selector = "media")
    public native YMANativeAdMedia getMedia();
    @Property(selector = "setMedia:")
    public native void setMedia(YMANativeAdMedia v);
    @Property(selector = "price")
    public native String getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(String v);
    @Property(selector = "rating")
    public native NSNumber getRating();
    @Property(selector = "setRating:")
    public native void setRating(NSNumber v);
    @Property(selector = "reviewCount")
    public native String getReviewCount();
    @Property(selector = "setReviewCount:")
    public native void setReviewCount(String v);
    @Property(selector = "sponsored")
    public native String getSponsored();
    @Property(selector = "setSponsored:")
    public native void setSponsored(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "warning")
    public native String getWarning();
    @Property(selector = "setWarning:")
    public native void setWarning(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
