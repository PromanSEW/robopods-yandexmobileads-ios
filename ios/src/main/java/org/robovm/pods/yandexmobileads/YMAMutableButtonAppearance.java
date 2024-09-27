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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMAMutableButtonAppearance/*</name>*/ 
    extends /*<extends>*/YMAButtonAppearance/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMAMutableButtonAppearancePtr extends Ptr<YMAMutableButtonAppearance, YMAMutableButtonAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMAMutableButtonAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMAMutableButtonAppearance() {}
    protected YMAMutableButtonAppearance(Handle h, long handle) { super(h, handle); }
    protected YMAMutableButtonAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    public YMAMutableButtonAppearance(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth) { super((SkipInit) null); initObject(initWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(textAppearance, normalColor, highlightedColor, borderColor, borderWidth)); }
    @Method(selector = "initWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    public YMAMutableButtonAppearance(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth) { super((SkipInit) null); initObject(initWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(textAppearance, highlightedTextColor, normalColor, highlightedColor, borderColor, borderWidth)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textAppearance")
    public native YMALabelAppearance getTextAppearance();
    @Property(selector = "setTextAppearance:")
    public native void setTextAppearance(YMALabelAppearance v);
    @Property(selector = "highlightedTextColor")
    public native UIColor getHighlightedTextColor();
    @Property(selector = "setHighlightedTextColor:")
    public native void setHighlightedTextColor(UIColor v);
    @Property(selector = "normalColor")
    public native UIColor getNormalColor();
    @Property(selector = "setNormalColor:")
    public native void setNormalColor(UIColor v);
    @Property(selector = "highlightedColor")
    public native UIColor getHighlightedColor();
    @Property(selector = "setHighlightedColor:")
    public native void setHighlightedColor(UIColor v);
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(UIColor v);
    @Property(selector = "borderWidth")
    public native @MachineSizedFloat double getBorderWidth();
    @Property(selector = "setBorderWidth:")
    public native void setBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "buttonAppearance")
    public native YMAButtonAppearance getButtonAppearance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    protected native @Pointer long initWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    @Method(selector = "initWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    protected native @Pointer long initWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    /**
     * @deprecated copy(with:) is deprecated. Use `buttonAppearance` property instead.
     */
    @Deprecated
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
    @Method(selector = "appearanceWithTextAppearance:normalColor:highlightedColor:borderColor:borderWidth:")
    public static native YMAMutableButtonAppearance appearanceWithTextAppearance$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    @Method(selector = "appearanceWithTextAppearance:highlightedTextColor:normalColor:highlightedColor:borderColor:borderWidth:")
    public static native YMAMutableButtonAppearance appearanceWithTextAppearance$highlightedTextColor$normalColor$highlightedColor$borderColor$borderWidth$(YMALabelAppearance textAppearance, UIColor highlightedTextColor, UIColor normalColor, UIColor highlightedColor, UIColor borderColor, @MachineSizedFloat double borderWidth);
    /*</methods>*/
}
