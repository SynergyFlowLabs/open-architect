package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q3.b("activity")
@SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,504:1\n183#2,2:505\n90#3:507\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n*L\n46#1:505,2\n96#1:507\n*E\n"})
public class g extends q3<b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f70985f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f70986g = "android-support-navigation:ActivityNavigator:source";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f70987h = "android-support-navigation:ActivityNavigator:current";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f70988i = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f70989j = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f70990k = "ActivityNavigator";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f70991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Activity f70992e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final void a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(g.f70988i, -1);
            int intExtra2 = intent.getIntExtra(g.f70989j, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        private a() {
        }
    }

    @y1.a(Activity.class)
    @SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,504:1\n233#2,3:505\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n261#1:505,3\n*E\n"})
    public static class b extends y1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private Intent f70993h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private String f70994i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f70995j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private ComponentName f70996k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private String f70997l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private Uri f70998m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull q3<? extends b> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        private final String G0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            return StringsKt.k2(str, v2.f71375h, packageName, false, 4, null);
        }

        @Nullable
        public final Uri A0() {
            Intent intent = this.f70993h;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Nullable
        public final String D0() {
            return this.f70994i;
        }

        @Nullable
        public final Intent E0() {
            return this.f70993h;
        }

        @Nullable
        public final String F0() {
            Intent intent = this.f70993h;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @NotNull
        public final b I0(@Nullable String str) {
            if (this.f70993h == null) {
                this.f70993h = new Intent();
            }
            Intent intent = this.f70993h;
            Intrinsics.checkNotNull(intent);
            intent.setAction(str);
            return this;
        }

        @NotNull
        public final b J0(@Nullable ComponentName componentName) {
            if (this.f70993h == null) {
                this.f70993h = new Intent();
            }
            Intent intent = this.f70993h;
            Intrinsics.checkNotNull(intent);
            intent.setComponent(componentName);
            return this;
        }

        @NotNull
        public final b K0(@Nullable Uri uri) {
            if (this.f70993h == null) {
                this.f70993h = new Intent();
            }
            Intent intent = this.f70993h;
            Intrinsics.checkNotNull(intent);
            intent.setData(uri);
            return this;
        }

        @NotNull
        public final b L0(@Nullable String str) {
            this.f70994i = str;
            return this;
        }

        @NotNull
        public final b N0(@Nullable Intent intent) {
            this.f70993h = intent;
            return this;
        }

        @NotNull
        public final b O0(@Nullable String str) {
            if (this.f70993h == null) {
                this.f70993h = new Intent();
            }
            Intent intent = this.f70993h;
            Intrinsics.checkNotNull(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.y1
        @androidx.annotation.i
        public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.a0(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, y3.c.f71463a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
            O0(G0(context, typedArrayObtainAttributes.getString(y3.c.f71468f)));
            String string = typedArrayObtainAttributes.getString(y3.c.f71464b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                J0(new ComponentName(context, string));
            }
            I0(typedArrayObtainAttributes.getString(y3.c.f71465c));
            String strG0 = G0(context, typedArrayObtainAttributes.getString(y3.c.f71466d));
            if (strG0 != null) {
                K0(Uri.parse(strG0));
            }
            L0(G0(context, typedArrayObtainAttributes.getString(y3.c.f71467e)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.y1
        public boolean equals(@Nullable Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f70993h;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) obj).f70993h);
                } else {
                    zFilterEquals = ((b) obj).f70993h == null;
                }
                if (zFilterEquals && Intrinsics.areEqual(this.f70994i, ((b) obj).f70994i)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.y1
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f70993h;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f70994i;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.y1
        @NotNull
        public String toString() {
            ComponentName componentNameZ0 = z0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameZ0 != null) {
                sb2.append(" class=");
                sb2.append(componentNameZ0.getClassName());
            } else {
                String strV0 = v0();
                if (strV0 != null) {
                    sb2.append(" action=");
                    sb2.append(strV0);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @Override // androidx.navigation.y1
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public boolean u0() {
            return false;
        }

        @Nullable
        public final String v0() {
            Intent intent = this.f70993h;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Nullable
        public final ComponentName z0() {
            Intent intent = this.f70993h;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull r3 navigatorProvider) {
            this((q3<? extends b>) navigatorProvider.e(g.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }
    }

    public static final class c implements q3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f70999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final androidx.core.app.e f71000b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f71001a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private androidx.core.app.e f71002b;

            @NotNull
            public final a a(int i10) {
                this.f71001a = i10 | this.f71001a;
                return this;
            }

            @NotNull
            public final c b() {
                return new c(this.f71001a, this.f71002b);
            }

            @NotNull
            public final a c(@NotNull androidx.core.app.e activityOptions) {
                Intrinsics.checkNotNullParameter(activityOptions, "activityOptions");
                this.f71002b = activityOptions;
                return this;
            }
        }

        public c(int i10, @Nullable androidx.core.app.e eVar) {
            this.f70999a = i10;
            this.f71000b = eVar;
        }

        @Nullable
        public final androidx.core.app.e a() {
            return this.f71000b;
        }

        public final int b() {
            return this.f70999a;
        }
    }

    public g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70991d = context;
        for (Object obj : kotlin.sequences.o.l(context, new Function1() { // from class: androidx.navigation.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return g.u((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f70992e = (Activity) obj;
            }
        }
        obj = null;
        this.f70992e = (Activity) obj;
    }

    @oj.n
    public static final void r(@NotNull Activity activity) {
        f70985f.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context u(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @Override // androidx.navigation.q3
    public boolean p() {
        Activity activity = this.f70992e;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final Context t() {
        return this.f70991d;
    }

    @Override // androidx.navigation.q3
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public y1 g(@NotNull b destination, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        androidx.core.app.e eVarA;
        Intent intent;
        int intExtra;
        String strEncode;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.E0() == null) {
            throw new IllegalStateException(("Destination " + destination.D() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.E0());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strD0 = destination.D0();
            if (strD0 != null && strD0.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strD0);
                while (matcher.find()) {
                    Bundle bundleB = androidx.savedstate.f.b(bundle);
                    int i10 = 6 ^ 1;
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNull(strGroup);
                    if (!androidx.savedstate.f.c(bundleB, strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strD0).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    j0 j0Var = destination.u().get(strGroup);
                    d3<Object> d3VarB = j0Var != null ? j0Var.b() : null;
                    if (d3VarB == null || (strEncode = d3VarB.serializeAsValue(d3VarB.get(bundle, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar instanceof c;
        if (z10) {
            intent2.addFlags(((c) aVar).b());
        }
        if (this.f70992e == null) {
            intent2.addFlags(268435456);
        }
        if (w2Var != null && w2Var.k()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f70992e;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f70987h, 0)) != 0) {
            intent2.putExtra(f70986g, intExtra);
        }
        intent2.putExtra(f70987h, destination.D());
        Resources resources = this.f70991d.getResources();
        if (w2Var != null) {
            int iC = w2Var.c();
            int iD = w2Var.d();
            if ((iC <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra(f70988i, iC);
                Intrinsics.checkNotNull(intent2.putExtra(f70989j, iD));
            } else {
                resources.getResourceName(iC);
                resources.getResourceName(iD);
                destination.toString();
            }
        }
        if (!z10 || (eVarA = ((c) aVar).a()) == null) {
            this.f70991d.startActivity(intent2);
        } else {
            androidx.core.content.d.A(this.f70991d, intent2, eVarA.n());
        }
        if (w2Var != null && this.f70992e != null) {
            int iA = w2Var.a();
            int iB = w2Var.b();
            if ((iA > 0 && Intrinsics.areEqual(resources.getResourceTypeName(iA), "animator")) || (iB > 0 && Intrinsics.areEqual(resources.getResourceTypeName(iB), "animator"))) {
                resources.getResourceName(iA);
                resources.getResourceName(iB);
                destination.toString();
            } else if (iA >= 0 || iB >= 0) {
                this.f70992e.overridePendingTransition(kotlin.ranges.r.u(iA, 0), kotlin.ranges.r.u(iB, 0));
            }
        }
        return null;
    }
}
