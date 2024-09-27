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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAButtonAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAButtonAppearancePtr extends Ptr<YMAButtonAppearance, YMAButtonAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAButtonAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAButtonAppearance() {}
    protected YMAButtonAppearance(Handle h, long handle) { super(h, handle); }
    protected YMAButtonAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    public YMAButtonAppearance(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth) { super((SkipInit) null); initObject(initWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(textAppearance, normalColor, highlightedColor, borderColor, borderWidth)); }
    @Method(selector = "initWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    public YMAButtonAppearance(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth) { super((SkipInit) null); initObject(initWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(textAppearance, highlightedTextColor, normalColor, highlightedColor, borderColor, borderWidth)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textAppearance")
    public native YMALabelAppearance getTextAppearance();
    @Property(selector = "highlightedTextColor")
    public native UIColor getHighlightedTextColor();
    @Property(selector = "normalColor")
    public native UIColor getNormalColor();
    @Property(selector = "highlightedColor")
    public native UIColor getHighlightedColor();
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "borderWidth")
    public native @MachineSizedFloat double getBorderWidth();
    @Property(selector = "mutableAppearance")
    public native YMAMutableButtonAppearance getMutableAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    protected native @Pointer long initWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    @Method(selector = "initWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    protected native @Pointer long initWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
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
    @Method(selector = "appearanceWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    public static native YMAButtonAppearance appearanceWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    @Method(selector = "appearanceWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    public static native YMAButtonAppearance appearanceWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    /*</methods>*/
}
