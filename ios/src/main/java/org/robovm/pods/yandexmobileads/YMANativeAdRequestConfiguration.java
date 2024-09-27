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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMANativeAdRequestConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMANativeAdRequestConfigurationPtr extends Ptr<YMANativeAdRequestConfiguration, YMANativeAdRequestConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMANativeAdRequestConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YMANativeAdRequestConfiguration() {}
    protected YMANativeAdRequestConfiguration(Handle h, long handle) { super(h, handle); }
    protected YMANativeAdRequestConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:")
    public YMANativeAdRequestConfiguration(String adUnitID) { super((SkipInit) null); initObject(initWithAdUnitID$(adUnitID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "age")
    public native NSNumber getAge();
    @Property(selector = "contextQuery")
    public native String getContextQuery();
    @Property(selector = "contextTags")
    public native NSArray<NSString> getContextTags();
    @Property(selector = "gender")
    public native String getGender();
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "adTheme")
    public native YMAAdTheme getAdTheme();
    @Property(selector = "biddingData")
    public native String getBiddingData();
    @Property(selector = "parameters")
    public native NSDictionary<NSString, NSString> getParameters();
    @Property(selector = "shouldLoadImagesAutomatically")
    public native boolean shouldLoadImagesAutomatically();
    @Property(selector = "mutableConfiguration")
    public native YMAMutableNativeAdRequestConfiguration getMutableConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:")
    protected native @Pointer long initWithAdUnitID$(String adUnitID);
    /**
     * @deprecated copy(with:) is deprecated. Will be removed in future versions.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    /**
     * @deprecated mutableCopy(with:) is deprecated. Use `mutableConfiguration` property instead.
     */
    @Deprecated
    @Method(selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);
    /*</methods>*/
}
