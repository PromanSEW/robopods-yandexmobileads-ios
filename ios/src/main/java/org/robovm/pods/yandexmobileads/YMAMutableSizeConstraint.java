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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAMutableSizeConstraint/*</name>*/ 
    extends /*<extends>*/YMASizeConstraint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAMutableSizeConstraintPtr extends Ptr<YMAMutableSizeConstraint, YMAMutableSizeConstraintPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAMutableSizeConstraint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAMutableSizeConstraint() {}
    protected YMAMutableSizeConstraint(Handle h, long handle) { super(h, handle); }
    protected YMAMutableSizeConstraint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithType:value:")
    public YMAMutableSizeConstraint(YMASizeConstraintType type, @MachineSizedFloat double value) { super((SkipInit) null); initObject(initWithType$value$(type, value)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native YMASizeConstraintType getType();
    @Property(selector = "setType:")
    public native void setType(YMASizeConstraintType v);
    @Property(selector = "value")
    public native @MachineSizedFloat double getValue();
    @Property(selector = "setValue:")
    public native void setValue(@MachineSizedFloat double v);
    @Property(selector = "constraint")
    public native YMASizeConstraint getConstraint();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithType:value:")
    protected native @Pointer long initWithType$value$(YMASizeConstraintType type, @MachineSizedFloat double value);
    /**
     * @deprecated copy(with:) is deprecated. Use `constraint` property instead.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    @Method(selector = "constraintWithType:value:")
    public static native YMAMutableSizeConstraint constraintWithType$value$(YMASizeConstraintType type, @MachineSizedFloat double value);
    /*</methods>*/
}
