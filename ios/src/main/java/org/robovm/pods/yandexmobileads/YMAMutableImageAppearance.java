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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAMutableImageAppearance/*</name>*/ 
    extends /*<extends>*/YMAImageAppearance/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAMutableImageAppearancePtr extends Ptr<YMAMutableImageAppearance, YMAMutableImageAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAMutableImageAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAMutableImageAppearance() {}
    protected YMAMutableImageAppearance(Handle h, long handle) { super(h, handle); }
    protected YMAMutableImageAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWidthConstraint:")
    public YMAMutableImageAppearance(YMASizeConstraint widthConstraint) { super((SkipInit) null); initObject(initWithWidthConstraint$(widthConstraint)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "widthConstraint")
    public native YMASizeConstraint getWidthConstraint();
    @Property(selector = "setWidthConstraint:")
    public native void setWidthConstraint(YMASizeConstraint v);
    @Property(selector = "imageAppearance")
    public native YMAImageAppearance getImageAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWidthConstraint:")
    protected native @Pointer long initWithWidthConstraint$(YMASizeConstraint widthConstraint);
    /**
     * @deprecated copy(with:) is deprecated. Use `imageAppearance` property instead.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    @Method(selector = "appearanceWithWidthConstraint:")
    public static native YMAMutableImageAppearance appearanceWithWidthConstraint$(YMASizeConstraint widthConstraint);
    /*</methods>*/
}
