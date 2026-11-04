package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavInflater.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.android.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n+ 5 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 9 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,367:1\n1#2:368\n1#2:408\n233#3,3:369\n233#3,3:372\n233#3,3:375\n233#3,3:378\n52#4,8:381\n60#4:412\n27#5:389\n46#5:390\n32#5,4:391\n31#5,7:401\n126#6:395\n153#6,3:396\n37#7,2:399\n106#8:409\n90#8:411\n46#9:410\n*S KotlinDebug\n*F\n+ 1 NavInflater.android.kt\nandroidx/navigation/NavInflater\n*L\n314#1:408\n112#1:369,3\n130#1:372,3\n146#1:375,3\n263#1:378,3\n297#1:381,8\n297#1:412\n314#1:389\n314#1:390\n314#1:391,4\n314#1:401,7\n314#1:395\n314#1:396,3\n314#1:399,2\n314#1:409\n334#1:411\n314#1:410\n*E\n"})
public final class v2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f71371d = "argument";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f71372e = "deepLink";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f71373f = "action";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f71374g = "include";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String f71375h = "${applicationId}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f71377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r3 f71378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f71370c = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<TypedValue> f71376i = new ThreadLocal<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d3<?> a(@NotNull TypedValue value, @Nullable d3<?> d3Var, @NotNull d3<?> expectedNavType, @Nullable String str, @NotNull String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (d3Var == null || d3Var == expectedNavType) {
                return d3Var == null ? expectedNavType : d3Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        private a() {
        }
    }

    public v2(@NotNull Context context, @NotNull r3 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f71377a = context;
        this.f71378b = navigatorProvider;
    }

    private final y1 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        r3 r3Var = this.f71378b;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        y1 y1VarC = r3Var.f(name).c();
        y1VarC.a0(this.f71377a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (Intrinsics.areEqual(f71371d, name2)) {
                    this.f(resources, y1VarC, attributeSet, i10);
                } else if (Intrinsics.areEqual(f71372e, name2)) {
                    this.g(resources, y1VarC, attributeSet);
                } else if (Intrinsics.areEqual("action", name2)) {
                    this.c(resources, y1VarC, attributeSet, xmlResourceParser, i10);
                } else {
                    v2 v2Var = this;
                    Resources resources2 = resources;
                    XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                    AttributeSet attributeSet2 = attributeSet;
                    int i11 = i10;
                    if (Intrinsics.areEqual(f71374g, name2) && (y1VarC instanceof e2)) {
                        TypedArray typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, y3.c.f71471i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
                        ((e2) y1VarC).z0(v2Var.b(typedArrayObtainAttributes.getResourceId(y3.c.f71472j, 0)));
                        Unit unit = Unit.f312394a;
                        typedArrayObtainAttributes.recycle();
                    } else if (y1VarC instanceof e2) {
                        ((e2) y1VarC).z0(v2Var.a(resources2, xmlResourceParser2, attributeSet2, i11));
                    }
                    this = v2Var;
                    resources = resources2;
                    attributeSet = attributeSet2;
                    xmlResourceParser = xmlResourceParser2;
                    i10 = i11;
                }
            }
        }
        return y1VarC;
    }

    private final void c(Resources resources, y1 y1Var, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        Pair[] pairArr;
        int depth;
        Context context = this.f71377a;
        int[] NavAction = d3.a.b.f269626a;
        Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269627b, 0);
        e0 e0Var = new e0(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269628c, 0), null, null, 6, null);
        w2.a aVar = new w2.a();
        aVar.d(typedArrayObtainStyledAttributes.getBoolean(d3.a.b.f269631f, false));
        aVar.v(typedArrayObtainStyledAttributes.getBoolean(d3.a.b.f269637l, false));
        aVar.h(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269634i, -1), typedArrayObtainStyledAttributes.getBoolean(d3.a.b.f269635j, false), typedArrayObtainStyledAttributes.getBoolean(d3.a.b.f269636k, false));
        aVar.b(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269629d, -1));
        aVar.c(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269630e, -1));
        aVar.e(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269632g, -1));
        aVar.f(typedArrayObtainStyledAttributes.getResourceId(d3.a.b.f269633h, -1));
        e0Var.e(aVar.a());
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual(f71371d, xmlResourceParser.getName())) {
                e(resources, bundleB, attributeSet, i10);
            }
        }
        if (!androidx.savedstate.f.B0(androidx.savedstate.f.b(bundleB))) {
            e0Var.d(bundleB);
        }
        y1Var.h0(resourceId, e0Var);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final j0 d(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        int iValueOf;
        j0.a aVar = new j0.a();
        aVar.c(typedArray.getBoolean(d3.a.b.f269642q, false));
        ThreadLocal<TypedValue> threadLocal = f71376i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(d3.a.b.f269641p);
        Object value = null;
        d3<Object> d3VarA = string != null ? d3.Companion.a(string, resources.getResourcePackageName(i10)) : null;
        if (typedArray.getValue(d3.a.b.f269640o, typedValue2)) {
            d3<Object> d3Var = d3.ReferenceType;
            if (d3VarA == d3Var) {
                int i11 = typedValue2.resourceId;
                if (i11 != 0) {
                    iValueOf = Integer.valueOf(i11);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + d3VarA.getName() + ". Must be a reference to a resource.");
                    }
                    iValueOf = 0;
                }
                value = iValueOf;
            } else {
                int i12 = typedValue2.resourceId;
                if (i12 != 0) {
                    if (d3VarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + d3VarA.getName() + ". You must use a \"" + d3Var.getName() + "\" type to reference other resources.");
                    }
                    value = Integer.valueOf(i12);
                    d3VarA = d3Var;
                } else if (d3VarA == d3.StringType) {
                    value = typedArray.getString(d3.a.b.f269640o);
                } else {
                    int i13 = typedValue2.type;
                    if (i13 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (d3VarA == null) {
                            d3VarA = d3.Companion.b(string2);
                        }
                        value = d3VarA.parseValue(string2);
                    } else if (i13 == 4) {
                        d3VarA = f71370c.a(typedValue2, d3VarA, d3.FloatType, string, "float");
                        value = Float.valueOf(typedValue2.getFloat());
                    } else if (i13 == 5) {
                        d3VarA = f71370c.a(typedValue2, d3VarA, d3.IntType, string, "dimension");
                        value = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                    } else if (i13 == 18) {
                        d3VarA = f71370c.a(typedValue2, d3VarA, d3.BoolType, string, "boolean");
                        value = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i13 < 16 || i13 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        d3<Object> d3Var2 = d3.FloatType;
                        if (d3VarA == d3Var2) {
                            d3VarA = f71370c.a(typedValue2, d3VarA, d3Var2, string, "float");
                            value = Float.valueOf(typedValue2.data);
                        } else {
                            d3VarA = f71370c.a(typedValue2, d3VarA, d3.IntType, string, "integer");
                            value = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
        }
        if (value != null) {
            aVar.b(value);
        }
        if (d3VarA != null) {
            aVar.d(d3VarA);
        }
        return aVar.a();
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, d3.a.b.f269638m);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(d3.a.b.f269639n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        j0 j0VarD = d(typedArrayObtainAttributes, resources, i10);
        if (j0VarD.c()) {
            j0VarD.f(string, bundle);
        }
        Unit unit = Unit.f312394a;
        typedArrayObtainAttributes.recycle();
    }

    private final void f(Resources resources, y1 y1Var, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, d3.a.b.f269638m);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(d3.a.b.f269639n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        y1Var.d(string, d(typedArrayObtainAttributes, resources, i10));
        Unit unit = Unit.f312394a;
        typedArrayObtainAttributes.recycle();
    }

    private final void g(Resources resources, y1 y1Var, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, d3.a.b.f269643r);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(d3.a.b.f269647v);
        String string2 = typedArrayObtainAttributes.getString(d3.a.b.f269645t);
        String string3 = typedArrayObtainAttributes.getString(d3.a.b.f269646u);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        o1.a aVar = new o1.a();
        if (string != null) {
            String packageName = this.f71377a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            aVar.g(StringsKt.k2(string, f71375h, packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.f71377a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
            aVar.e(StringsKt.k2(string2, f71375h, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f71377a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "getPackageName(...)");
            aVar.f(StringsKt.k2(string3, f71375h, packageName3, false, 4, null));
        }
        y1Var.i(aVar.a());
        Unit unit = Unit.f312394a;
        typedArrayObtainAttributes.recycle();
    }

    @e.a({"ResourceType"})
    @NotNull
    public final e2 b(@androidx.annotation.n0 int i10) {
        int next;
        Resources resources = this.f71377a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNull(resources);
        Intrinsics.checkNotNull(attributeSetAsAttributeSet);
        y1 y1VarA = a(resources, xml, attributeSetAsAttributeSet, i10);
        if (y1VarA instanceof e2) {
            e2 e2Var = (e2) y1VarA;
            xml.close();
            return e2Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
