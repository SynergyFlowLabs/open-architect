package app.rive.runtime.kotlin.fonts;

import android.util.Xml;
import com.facebook.internal.z0;
import com.facebook.share.internal.k;
import io.ktor.http.m;
import io.sentry.protocol.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemFontsParser {

    @NotNull
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";

    @NotNull
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";

    @NotNull
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";

    @NotNull
    private static final String TAG = "SystemFontsParser";

    @NotNull
    private static final List<Pair<Fonts.Weight, String>> fontFilesOrder;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> SYSTEM_FONTS_PATHS = CollectionsKt.listOf((Object[]) new String[]{"/system/fonts/", "/system/font/", "/data/fonts/", "/system/product/fonts/"});

    @SourceDebugExtension({"SMAP\nFontHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1017:1\n1#2:1018\n1#2:1048\n1863#3,2:1019\n1872#3,2:1028\n1874#3:1037\n1611#3,9:1038\n1863#3:1047\n1864#3:1049\n1620#3:1050\n1863#3:1051\n1864#3:1059\n381#4,7:1021\n381#4,7:1030\n381#4,7:1052\n*S KotlinDebug\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion\n*L\n795#1:1048\n448#1:1019,2\n756#1:1028,2\n756#1:1037\n795#1:1038,9\n795#1:1047\n795#1:1049\n795#1:1050\n826#1:1051\n826#1:1059\n622#1:1021,7\n777#1:1030,7\n835#1:1052,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFileFonts(List<Fonts.FileFont> list, List<String> list2, String str, String str2, String str3) {
            String str4;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = list.iterator();
            int i10 = 0;
            while (true) {
                str4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Fonts.FileFont fileFont = (Fonts.FileFont) next;
                if (i10 >= SystemFontsParser.fontFilesOrder.size()) {
                    SystemFontsParser.fontFilesOrder.size();
                    fileFont.getName();
                } else {
                    Pair pair = (Pair) SystemFontsParser.fontFilesOrder.get(i10);
                    Fonts.Weight weight = (Fonts.Weight) pair.component1();
                    String str5 = (String) pair.component2();
                    String string = StringsKt.E5(fileFont.getName()).toString();
                    if (string.length() != 0) {
                        Fonts.Font font = new Fonts.Font(weight, str5, string, null);
                        Object arrayList = linkedHashMap.get(weight);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(weight, arrayList);
                        }
                        ((List) arrayList).add(font);
                    }
                }
                i10 = i11;
            }
            if (linkedHashMap.isEmpty()) {
                return new Pair<>(new Fonts.Family(str, str3, str2, MapsKt.emptyMap()), CollectionsKt.emptyList());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                String string2 = StringsKt.E5((String) it2.next()).toString();
                Fonts.Alias alias = string2.length() > 0 ? new Fonts.Alias(string2, str, null) : null;
                if (alias != null) {
                    arrayList2.add(alias);
                }
            }
            if (str3 == null) {
                Fonts.FileFont fileFont2 = (Fonts.FileFont) CollectionsKt.firstOrNull((List) list);
                str3 = fileFont2 != null ? fileFont2.getVariant() : null;
            }
            if (str2 == null) {
                Fonts.FileFont fileFont3 = (Fonts.FileFont) CollectionsKt.firstOrNull((List) list);
                str2 = fileFont3 != null ? fileFont3.getLang() : null;
            }
            String string3 = str3 != null ? StringsKt.E5(str3).toString() : null;
            if (string3 == null || StringsKt.w3(string3)) {
                string3 = null;
            }
            String string4 = str2 != null ? StringsKt.E5(str2).toString() : null;
            if (string4 != null && !StringsKt.w3(string4)) {
                str4 = string4;
            }
            return new Pair<>(new Fonts.Family(str, string3, str4, linkedHashMap), arrayList2);
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFontList(String str, List<Fonts.Font> list, String str2, String str3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Fonts.Font font : list) {
                if (!StringsKt.w3(font.getName())) {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            return linkedHashMap.isEmpty() ? new Pair<>(new Fonts.Family(str, str3, str2, MapsKt.emptyMap()), CollectionsKt.emptyList()) : new Pair<>(new Fonts.Family(str, str3, str2, linkedHashMap), CollectionsKt.emptyList());
        }

        private final String getOptionalAttribute(XmlPullParser xmlPullParser, String str, String str2) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue == null ? str2 : attributeValue;
        }

        static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str2 = null;
                int i11 = 6 ^ 0;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new IllegalArgumentException("Missing required attribute: " + str);
        }

        private final Fonts.Alias readAlias(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Companion companion;
            XmlPullParser xmlPullParser2;
            xmlPullParser.require(2, null, "alias");
            try {
                String requiredAttribute = getRequiredAttribute(xmlPullParser, "name");
                String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "to");
                companion = this;
                xmlPullParser2 = xmlPullParser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser2, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.Companion.fromString(optionalAttribute$default) : null;
                    companion.skip(xmlPullParser2);
                    if (!StringsKt.w3(requiredAttribute) && !StringsKt.w3(requiredAttribute2)) {
                        return new Fonts.Alias(StringsKt.E5(requiredAttribute).toString(), StringsKt.E5(requiredAttribute2).toString(), weightFromString);
                    }
                    return null;
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    e.getMessage();
                    companion.skip(xmlPullParser2);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                companion = this;
                xmlPullParser2 = xmlPullParser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser xmlPullParser) {
            String requiredAttribute = getRequiredAttribute(xmlPullParser, "tag");
            String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "stylevalue");
            skip(xmlPullParser);
            if (StringsKt.w3(requiredAttribute) || StringsKt.w3(requiredAttribute2)) {
                throw new IllegalArgumentException("Axis tag found with blank 'tag' or 'stylevalue'.");
            }
            return new Fonts.Axis(requiredAttribute, requiredAttribute2);
        }

        private final Fonts.Family readFamily(String str, XmlPullParser xmlPullParser) {
            Companion companion = SystemFontsParser.Companion;
            n1 n1Var = new n1(getOptionalAttribute$default(companion, xmlPullParser, "lang", null, 4, null), getOptionalAttribute$default(companion, xmlPullParser, "variant", null, 4, null), getOptionalAttribute$default(companion, xmlPullParser, "ignore", null, 4, null));
            String str2 = (String) n1Var.a();
            String str3 = (String) n1Var.b();
            String str4 = (String) n1Var.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.E5(name).toString(), m.d.f296017b)) {
                        try {
                            Fonts.Font font = readFont(xmlPullParser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e10) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to read <font> in family '");
                            sb2.append(str);
                            sb2.append("': ");
                            sb2.append(e10.getMessage());
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{z0.P, "1"}), str4) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(str, str3, str2, linkedHashMap);
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser xmlPullParser, List<Fonts.Alias> list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, e.c.f306216d);
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "name", null, 4, null);
            String string = optionalAttribute$default != null ? StringsKt.E5(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, xmlPullParser);
            }
            Pair<Fonts.Family, List<Fonts.Alias>> legacyFamily = readLegacyFamily(xmlPullParser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family familyComponent1 = legacyFamily.component1();
            List<Fonts.Alias> listComponent2 = legacyFamily.component2();
            if (!listComponent2.isEmpty()) {
                list.addAll(listComponent2);
            }
            return familyComponent1;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
        private final List<Fonts.FileFont> readFileset(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser2;
            String string;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            xmlPullParser.require(2, null, "fileset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.E5(name).toString(), k.f101891c)) {
                        Companion companion = SystemFontsParser.Companion;
                        xmlPullParser2 = xmlPullParser;
                        String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser2, "variant", null, 4, null);
                        if (optionalAttribute$default == null || StringsKt.w3(optionalAttribute$default)) {
                            optionalAttribute$default = null;
                        }
                        String optionalAttribute$default2 = getOptionalAttribute$default(companion, xmlPullParser2, "lang", null, 4, null);
                        if (optionalAttribute$default2 == null || StringsKt.w3(optionalAttribute$default2)) {
                            optionalAttribute$default2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (xmlPullParser2.next() == 4) {
                            String text = xmlPullParser2.getText();
                            if (text == null || (string = StringsKt.E5(text).toString()) == null) {
                                string = "";
                            }
                            sb2.append(string);
                            xmlPullParser2.next();
                        }
                        String string2 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (xmlPullParser2.getEventType() == 3) {
                            String name2 = xmlPullParser2.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!Intrinsics.areEqual(StringsKt.E5(name2).toString(), k.f101891c)) {
                                xmlPullParser2.getEventType();
                                xmlPullParser2.getName();
                            }
                        } else {
                            xmlPullParser2.getEventType();
                            xmlPullParser2.getName();
                        }
                        if (string2.length() == 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            listCreateListBuilder.add(new Fonts.FileFont(string2, optionalAttribute$default, optionalAttribute$default2));
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        SystemFontsParser.Companion.skip(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                }
            }
            return CollectionsKt.build(listCreateListBuilder);
        }

        private final Fonts.Font readFont(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String text;
            xmlPullParser.require(2, null, m.d.f296017b);
            Fonts.Weight.Companion companion = Fonts.Weight.Companion;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(xmlPullParser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(xmlPullParser, "style", "normal");
            String str = optionalAttribute != null ? optionalAttribute : "normal";
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.E5(name).toString(), "axis")) {
                        try {
                            arrayList.add(readAxis(xmlPullParser));
                        } catch (Exception e10) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Failed to read <axis> tag: ");
                            sb3.append(e10.getMessage());
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                } else if (eventType == 4 && (text = xmlPullParser.getText()) != null) {
                    sb2.append(text);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = StringsKt.E5(string).toString();
            if (string2.length() == 0) {
                string2 = null;
            }
            if (string2 != null) {
                return new Fonts.Font(weightFromString, str, string2, arrayList.isEmpty() ? null : arrayList);
            }
            throw new IllegalStateException("Font tag found with empty filename");
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> readLegacyFamily(XmlPullParser xmlPullParser) {
            String string;
            String name;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, xmlPullParser, "lang", null, 4, null);
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    try {
                        String name2 = xmlPullParser.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        String string2 = StringsKt.E5(name2).toString();
                        int iHashCode = string2.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string2.equals("nameset")) {
                                    arrayList.addAll(readNameset(xmlPullParser));
                                } else {
                                    skip(xmlPullParser);
                                }
                            } else if (string2.equals(m.d.f296017b)) {
                                arrayList3.add(readFont(xmlPullParser));
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string2.equals("fileset")) {
                            arrayList2.addAll(readFileset(xmlPullParser));
                        } else {
                            skip(xmlPullParser);
                        }
                    } catch (Exception e10) {
                        xmlPullParser.getName();
                        e10.getMessage();
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList.isEmpty()) {
                    Fonts.Font font = (Fonts.Font) CollectionsKt.firstOrNull((List) arrayList3);
                    string = (font == null || (name = font.getName()) == null) ? null : StringsKt.E5(name).toString();
                    if (string != null) {
                        if (StringsKt.w3(string)) {
                        }
                    }
                    return null;
                }
                string = arrayList.remove(0);
                return fromFontList(string, arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                String string3 = StringsKt.E5(((Fonts.FileFont) CollectionsKt.first((List) arrayList2)).getName()).toString();
                if (StringsKt.w3(string3)) {
                    ((Fonts.FileFont) CollectionsKt.first((List) arrayList2)).getName();
                    return null;
                }
                arrayList.add(string3);
            }
            String string4 = StringsKt.E5(arrayList.remove(0)).toString();
            if (string4.length() == 0) {
                return null;
            }
            return fromFileFonts(arrayList2, arrayList, string4, optionalAttribute$default2, optionalAttribute$default);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        private final List<String> readNameset(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String string;
            xmlPullParser.require(2, null, "nameset");
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (Intrinsics.areEqual(StringsKt.E5(name).toString(), "name")) {
                        String str = "";
                        if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if (text != null && (string = StringsKt.E5(text).toString()) != null) {
                                str = string;
                            }
                            xmlPullParser.next();
                        }
                        if (xmlPullParser.getEventType() == 3) {
                            String name2 = xmlPullParser.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!Intrinsics.areEqual(StringsKt.E5(name2).toString(), "name")) {
                                xmlPullParser.getEventType();
                                xmlPullParser.getName();
                            }
                        } else {
                            xmlPullParser.getEventType();
                            xmlPullParser.getName();
                        }
                        if (!StringsKt.w3(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        private final void readNestedFamilies(XmlPullParser xmlPullParser, Map<String, Fonts.Family> map, List<Fonts.Alias> list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "familyset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String string = StringsKt.E5(name).toString();
                    if (Intrinsics.areEqual(string, e.c.f306216d)) {
                        Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, list);
                        if (familyEntry != null) {
                            String name2 = familyEntry.getName();
                            Intrinsics.checkNotNull(name2);
                            map.put(name2, familyEntry);
                        }
                    } else if (Intrinsics.areEqual(string, "alias")) {
                        Fonts.Alias alias = readAlias(xmlPullParser);
                        if (alias != null) {
                            list.add(alias);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
        }

        private final Map<String, Fonts.Family> readRootElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10;
            xmlPullParser.require(2, null, null);
            String name = xmlPullParser.getName();
            if (!Intrinsics.areEqual(name, "familyset") && !Intrinsics.areEqual(name, "fonts-modification")) {
                Intrinsics.areEqual(name, "config");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Fonts.Alias> arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name2 = xmlPullParser.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    String string = StringsKt.E5(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(xmlPullParser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals(e.c.f306216d)) {
                            Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, arrayList);
                            if (familyEntry != null) {
                                String name3 = familyEntry.getName();
                                Intrinsics.checkNotNull(name3);
                                linkedHashMap.put(name3, familyEntry);
                            }
                        } else {
                            skip(xmlPullParser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(xmlPullParser, linkedHashMap, arrayList);
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            for (Fonts.Alias alias2 : arrayList) {
                if (linkedHashMap.containsKey(alias2.getName())) {
                    alias2.getName();
                } else {
                    Fonts.Family familyRemapAlias = SystemFontsParser.Companion.remapAlias(alias2, linkedHashMap);
                    if (familyRemapAlias != null) {
                        linkedHashMap.put(alias2.getName(), familyRemapAlias);
                    } else {
                        alias2.getName();
                        alias2.getOriginal();
                    }
                }
            }
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            for (boolean z11 = true; z11 && !mutableList.isEmpty(); z11 = z10) {
                Iterator it = mutableList.iterator();
                z10 = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family familyRemapAlias2 = remapAlias(alias3, linkedHashMap);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias2);
                            it.remove();
                            z10 = true;
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        private final Fonts.Family remapAlias(Fonts.Alias alias, Map<String, Fonts.Family> map) {
            Fonts.Family family = map.get(alias.getOriginal());
            if (family == null) {
                return null;
            }
            Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), family.getVariant(), family.getLang(), family.getFonts());
            }
            List<Fonts.Font> list = family.getFonts().get(weight);
            if (list == null || list.isEmpty()) {
                alias.getName();
                weight.getWeight();
                alias.getOriginal();
                return null;
            }
            family.component1();
            return new Fonts.Family(alias.getName(), family.component2(), family.component3(), MapsKt.mapOf(TuplesKt.to(weight, list)));
        }

        private final void skip(XmlPullParser xmlPullParser) {
            int next;
            int i10 = 1;
            while (i10 > 0 && (next = xmlPullParser.next()) != 1) {
                if (next == 2) {
                    i10++;
                } else if (next == 3) {
                    i10--;
                }
            }
        }

        @NotNull
        public final List<String> getSYSTEM_FONTS_PATHS$kotlin_release() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        @NotNull
        public final Map<String, Fonts.Family> parseFontsXML$kotlin_release(@NotNull InputStream xmlFileStream) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(xmlFileStream, "xmlFileStream");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            return readRootElement(xmlPullParserNewPullParser);
        }

        private Companion() {
        }
    }

    static {
        Fonts.Weight.Companion companion = Fonts.Weight.Companion;
        fontFilesOrder = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(companion.getNORMAL(), "normal"), new Pair(companion.getBOLD(), "normal"), new Pair(companion.getNORMAL(), "italic"), new Pair(companion.getBOLD(), "italic")});
    }
}
