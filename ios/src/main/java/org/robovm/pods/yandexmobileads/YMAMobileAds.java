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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAMobileAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAMobileAdsPtr extends Ptr<YMAMobileAds, YMAMobileAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAMobileAds.class); }/*</bind>*/
    /*<constants>*/
    public static final int YMA_VERSION_MAJOR = 7;
    public static final int YMA_VERSION_MINOR = 5;
    public static final int YMA_VERSION_PATCH = 1;
    public static final int YMA_BUILD_NUMBER = 95315;
    /*</constants>*/
    /*<constructors>*/
    protected YMAMobileAds() {}
    protected YMAMobileAds(Handle h, long handle) { super(h, handle); }
    protected YMAMobileAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableLogging")
    public static native void enableLogging();
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "audioSessionManager")
    public static native YMAAudioSessionManager audioSessionManager();
    @Method(selector = "setLocationTrackingEnabled:")
    public static native void setLocationTrackingEnabled(boolean enabled);
    @Method(selector = "enableVisibilityErrorIndicatorForDeviceType:")
    public static native void enableVisibilityErrorIndicatorForDeviceType(YMADeviceType deviceType);
    @Method(selector = "setUserConsent:")
    public static native void setUserConsent(boolean consent);
    @Method(selector = "initializeSDKWithCompletionHandler:")
    public static native void initializeSDKWithCompletionHandler$(@Block Runnable completionHandler);
    @Method(selector = "showDebugPanel")
    public static native void showDebugPanel();
    @Method(selector = "useVerificatorForUITests")
    public static native void useVerificatorForUITests();
    @Method(selector = "blockAdWithReason:")
    public static native void blockAdWithReason(String reason);
    /*</methods>*/
}
