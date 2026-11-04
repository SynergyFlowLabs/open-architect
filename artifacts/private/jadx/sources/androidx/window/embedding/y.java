package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class y {
    private final ComponentName a(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str, Intrinsics.stringPlus(str, string));
        }
        int iQ3 = StringsKt.q3(string, '/', 0, false, 6, null);
        if (iQ3 > 0) {
            str = string.substring(0, iQ3);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            string = string.substring(iQ3 + 1);
            Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
        }
        if (Intrinsics.areEqual(string, "*") || StringsKt.q3(string, '.', 0, false, 6, null) >= 0) {
            return new ComponentName(str, string);
        }
        return new ComponentName(str, str + '.' + string);
    }

    private final a b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, e4.a.c.f274633a, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(e4.a.c.f274635c);
        String string2 = typedArrayObtainStyledAttributes.getString(e4.a.c.f274634b);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new a(a(packageName, string), string2);
    }

    private final b c(Context context, XmlResourceParser xmlResourceParser) {
        return new b(SetsKt.emptySet(), context.getTheme().obtainStyledAttributes(xmlResourceParser, e4.a.c.f274636d, 0, 0).getBoolean(e4.a.c.f274637e, false));
    }

    private final u d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, e4.a.c.f274638f, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(e4.a.c.f274639g);
        String string2 = typedArrayObtainStyledAttributes.getString(e4.a.c.f274641i);
        String string3 = typedArrayObtainStyledAttributes.getString(e4.a.c.f274640h);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new u(a(packageName, string), a(packageName, string2), string3);
    }

    private final v e(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, e4.a.c.f274642j, 0, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(e4.a.c.f274649q, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(e4.a.c.f274648p, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(e4.a.c.f274647o, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(e4.a.c.f274646n, 3);
        return new v(SetsKt.emptySet(), typedArrayObtainStyledAttributes.getBoolean(e4.a.c.f274644l, false), typedArrayObtainStyledAttributes.getBoolean(e4.a.c.f274645m, true), typedArrayObtainStyledAttributes.getBoolean(e4.a.c.f274643k, false), dimension, dimension2, f10, i10);
    }

    private final w f(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, e4.a.c.f274650r, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(e4.a.c.f274651s);
        float f10 = typedArrayObtainStyledAttributes.getFloat(e4.a.c.f274655w, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(e4.a.c.f274654v, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(e4.a.c.f274653u, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(e4.a.c.f274652t, 3);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        ComponentName componentNameA = a(packageName, string);
        Set setEmptySet = SetsKt.emptySet();
        Intent component = new Intent().setComponent(componentNameA);
        Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new w(setEmptySet, component, dimension, dimension2, f10, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Set<m> h(Context context, int i10) throws XmlPullParserException, IOException {
        w wVarH;
        b bVarC;
        v vVarE;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            b bVar = null;
            v vVar = null;
            w wVar = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || Intrinsics.areEqual("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (bVar == null && wVar == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    a aVarB = b(context, xml);
                                    if (bVar != null) {
                                        hashSet.remove(bVar);
                                        bVarC = bVar.c(aVarB);
                                        hashSet.add(bVarC);
                                        bVar = bVarC;
                                    } else if (wVar != null) {
                                        hashSet.remove(wVar);
                                        wVarH = wVar.h(aVarB);
                                        hashSet.add(wVarH);
                                        wVar = wVarH;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    vVarE = e(context, xml);
                                    hashSet.add(vVarE);
                                    bVar = null;
                                    wVar = null;
                                    vVar = vVarE;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (vVar == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    u uVarD = d(context, xml);
                                    hashSet.remove(vVar);
                                    vVarE = vVar.j(uVarD);
                                    hashSet.add(vVarE);
                                    vVar = vVarE;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    bVarC = c(context, xml);
                                    hashSet.add(bVarC);
                                    vVar = null;
                                    wVar = null;
                                    bVar = bVarC;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    wVarH = f(context, xml);
                                    hashSet.add(wVarH);
                                    bVar = null;
                                    vVar = null;
                                    wVar = wVarH;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public final Set<m> g(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return h(context, i10);
    }
}
