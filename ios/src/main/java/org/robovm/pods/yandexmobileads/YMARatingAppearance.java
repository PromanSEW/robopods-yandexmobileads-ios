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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMARatingAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMARatingAppearancePtr extends Ptr<YMARatingAppearance, YMARatingAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMARatingAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMARatingAppearance() {}
    protected YMARatingAppearance(Handle h, long handle) { super(h, handle); }
    protected YMARatingAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEmptyStarColor:filledStarColor:starSize:")
    public YMARatingAppearance(UIColor emptyStarColor, UIColor filledStarColor, @MachineSizedFloat double starSize) { super((SkipInit) null); initObject(initWithEmptyStarColor$filledStarColor$starSize$(emptyStarColor, filledStarColor, starSize)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "emptyStarColor")
    public native UIColor getEmptyStarColor();
    @Property(selector = "filledStarColor")
    public native UIColor getFilledStarColor();
    @Property(selector = "preferredStarSize")
    public native @MachineSizedFloat double getPreferredStarSize();
    @Property(selector = "mutableAppearance")
    public native YMAMutableRatingAppearance getMutableAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEmptyStarColor:filledStarColor:starSize:")
    protected native @Pointer long initWithEmptyStarColor$filledStarColor$starSize$(UIColor emptyStarColor, UIColor filledStarColor, @MachineSizedFloat double starSize);
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
    @Method(selector = "appearanceWithEmptyStarColor:filledStarColor:starSize:")
    public static native YMARatingAppearance appearanceWithEmptyStarColor$filledStarColor$starSize$(UIColor emptyStarColor, UIColor filledStarColor, @MachineSizedFloat double starSize);
    /*</methods>*/
}
