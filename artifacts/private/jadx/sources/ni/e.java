package ni;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f333359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f333360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f333361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f333362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f333363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Integer f333364f;

    @NotNull
    public final GMTDate a() {
        Integer num = this.f333359a;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.f333360b;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f333361c;
        Intrinsics.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.f333362d;
        Intrinsics.checkNotNull(num4);
        int iIntValue4 = num4.intValue();
        h hVarE = e();
        Integer num5 = this.f333364f;
        Intrinsics.checkNotNull(num5);
        return a.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, hVarE, num5.intValue());
    }

    @Nullable
    public final Integer b() {
        return this.f333362d;
    }

    @Nullable
    public final Integer c() {
        return this.f333361c;
    }

    @Nullable
    public final Integer d() {
        return this.f333360b;
    }

    @NotNull
    public final h e() {
        h hVar = this.f333363e;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("month");
        return null;
    }

    @Nullable
    public final Integer f() {
        return this.f333359a;
    }

    @Nullable
    public final Integer g() {
        return this.f333364f;
    }

    public final void h(@Nullable Integer num) {
        this.f333362d = num;
    }

    public final void i(@Nullable Integer num) {
        this.f333361c = num;
    }

    public final void j(@Nullable Integer num) {
        this.f333360b = num;
    }

    public final void k(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f333363e = hVar;
    }

    public final void l(@Nullable Integer num) {
        this.f333359a = num;
    }

    public final void m(@Nullable Integer num) {
        this.f333364f = num;
    }
}
