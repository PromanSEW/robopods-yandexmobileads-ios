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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAAdRequestError/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAAdRequestErrorPtr extends Ptr<YMAAdRequestError, YMAAdRequestErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAAdRequestError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YMAAdRequestError() {}
    protected YMAAdRequestError(Handle h, long handle) { super(h, handle); }
    protected YMAAdRequestError(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitId:error:")
    public YMAAdRequestError(String adUnitId, NSError error) { super((SkipInit) null); initObject(initWithAdUnitId$error$(adUnitId, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "error")
    public native NSError getError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitId:error:")
    protected native @Pointer long initWithAdUnitId$error$(String adUnitId, NSError error);
    /*</methods>*/
}
