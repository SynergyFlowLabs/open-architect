package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.ui.text.x
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,318:1\n118#2,4:319\n118#2,4:323\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n*L\n242#1:319,4\n245#1:323,4\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f41914e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41915f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41916g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41917h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41918i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f41919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private q f41920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41921c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41922d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n0(@NotNull String str) {
        this.f41919a = str;
    }

    public final char a(int i10) {
        q qVar = this.f41920b;
        if (qVar != null && i10 >= this.f41921c) {
            int iE = qVar.e();
            int i11 = this.f41921c;
            return i10 < iE + i11 ? qVar.d(i10 - i11) : this.f41919a.charAt(i10 - ((iE - this.f41922d) + i11));
        }
        return this.f41919a.charAt(i10);
    }

    public final int b() {
        q qVar = this.f41920b;
        return qVar == null ? this.f41919a.length() : (this.f41919a.length() - (this.f41922d - this.f41921c)) + qVar.e();
    }

    @NotNull
    public final String c() {
        return this.f41919a;
    }

    public final void d(int i10, int i11, @NotNull String str) {
        if (!(i10 <= i11)) {
            x0.a.e("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (!(i10 >= 0)) {
            x0.a.e("start must be non-negative, but was " + i10);
        }
        q qVar = this.f41920b;
        if (qVar != null) {
            int i12 = this.f41921c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= qVar.e()) {
                qVar.g(i13, i14, str);
                return;
            }
            this.f41919a = toString();
            this.f41920b = null;
            this.f41921c = -1;
            this.f41922d = -1;
            d(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f41919a.length() - i11, 64);
        int i15 = i10 - iMin;
        s.a(this.f41919a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        s.a(this.f41919a, cArr, i16, i11, i17);
        r.b(str, cArr, iMin);
        this.f41920b = new q(cArr, iMin + str.length(), i16);
        this.f41921c = i15;
        this.f41922d = i17;
    }

    public final void e(@NotNull String str) {
        this.f41919a = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public String toString() {
        q qVar = this.f41920b;
        if (qVar == null) {
            return this.f41919a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f41919a, 0, this.f41921c);
        qVar.a(sb2);
        String str = this.f41919a;
        sb2.append((CharSequence) str, this.f41922d, str.length());
        return sb2.toString();
    }
}
