package androidx.compose.foundation.text;

import android.R;
import android.content.res.Resources;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class h5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h5 f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h5 f19339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h5 f19340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h5 f19341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h5 f19342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ h5[] f19343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f19344j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f19345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19347c;

    static {
        b0.e eVar = b0.e.f77490a;
        f19338d = new h5("Cut", 0, eVar.c(), R.string.cut, R.attr.actionModeCutDrawable);
        f19339e = new h5("Copy", 1, eVar.b(), R.string.copy, R.attr.actionModeCopyDrawable);
        f19340f = new h5("Paste", 2, eVar.d(), R.string.paste, R.attr.actionModePasteDrawable);
        f19341g = new h5("SelectAll", 3, eVar.e(), R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        f19342h = new h5("Autofill", 4, eVar.a(), R.string.autofill, 0);
        h5[] h5VarArrK = k();
        f19343i = h5VarArrK;
        f19344j = kotlin.enums.c.c(h5VarArrK);
    }

    private h5(String str, int i10, Object obj, int i11, int i12) {
        super(str, i10);
        this.f19345a = obj;
        this.f19346b = i11;
        this.f19347c = i12;
    }

    private static final /* synthetic */ h5[] k() {
        return new h5[]{f19338d, f19339e, f19340f, f19341g, f19342h};
    }

    @NotNull
    public static kotlin.enums.a<h5> n() {
        return f19344j;
    }

    public static h5 valueOf(String str) {
        return (h5) Enum.valueOf(h5.class, str);
    }

    public static h5[] values() {
        return (h5[]) f19343i.clone();
    }

    public final int l() {
        return this.f19347c;
    }

    @NotNull
    public final Object o() {
        return this.f19345a;
    }

    public final int p() {
        return this.f19346b;
    }

    @NotNull
    public final String q(@NotNull Resources resources) {
        return resources.getString(this.f19346b);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @NotNull
    public final String r(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:188)");
        }
        String strD = u0.i.d(this.f19346b, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return strD;
    }
}
