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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAInterstitialAdPtr extends Ptr<YMAInterstitialAd, YMAInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YMAInterstitialAd() {}
    protected YMAInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected YMAInterstitialAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adInfo")
    public native YMAAdInfo getAdInfo();
    @Property(selector = "delegate")
    public native YMAInterstitialAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(YMAInterstitialAdDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "showFromViewController:")
    public native void showFromViewController(UIViewController viewController);
    /*</methods>*/
}
