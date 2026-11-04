package androidx.compose.material3;

import android.R;
import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.i(name = "DynamicTonalPaletteKt")
public final class he {
    @androidx.annotation.w0(31)
    @NotNull
    public static final l6 a(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 34 ? c(context) : b(g(context));
    }

    @androidx.annotation.w0(31)
    @NotNull
    public static final l6 b(@NotNull q80 q80Var) {
        long jF0 = q80Var.f0();
        long jZ = q80Var.Z();
        long jA0 = q80Var.a0();
        long jG0 = q80Var.g0();
        long jB0 = q80Var.b0();
        long jS0 = q80Var.s0();
        long jM0 = q80Var.m0();
        long jN0 = q80Var.n0();
        long jT0 = q80Var.t0();
        long jF1 = q80Var.F0();
        long jZ0 = q80Var.z0();
        long jA1 = q80Var.A0();
        long jG1 = q80Var.G0();
        long jK = q80Var.K();
        long jP = q80Var.P();
        long jK2 = q80Var.K();
        long jP2 = q80Var.P();
        long jG = q80Var.G();
        long jN = q80Var.N();
        long jP3 = q80Var.P();
        long jD = q80Var.D();
        long jL = q80Var.L();
        long jG2 = q80Var.G();
        long jY = q80Var.y();
        long jF = q80Var.F();
        long jK3 = q80Var.K();
        return o6.m(jF0, jZ, jA0, jG0, jB0, jS0, jM0, jN0, jT0, jF1, jZ0, jA1, jG1, jK, jP, jK2, jP2, jG, jN, q80Var.f0(), jP3, jD, 0L, 0L, 0L, 0L, jL, jG2, jY, jF, q80Var.B(), q80Var.C(), q80Var.E(), q80Var.z(), q80Var.H(), jK3, q80Var.g0(), q80Var.f0(), q80Var.X(), q80Var.a0(), q80Var.t0(), q80Var.s0(), q80Var.k0(), q80Var.n0(), q80Var.G0(), q80Var.F0(), q80Var.x0(), q80Var.A0(), 62914560, 0, null);
    }

    @androidx.annotation.w0(34)
    @NotNull
    public static final l6 c(@NotNull Context context) {
        k6 k6Var = k6.f30004a;
        long jA = k6Var.a(context, R.color.system_primary_dark);
        long jA2 = k6Var.a(context, R.color.system_on_primary_dark);
        long jA3 = k6Var.a(context, R.color.system_primary_container_dark);
        long jA4 = k6Var.a(context, R.color.system_on_primary_container_dark);
        long jA5 = k6Var.a(context, R.color.system_primary_light);
        long jA6 = k6Var.a(context, R.color.system_secondary_dark);
        long jA7 = k6Var.a(context, R.color.system_on_secondary_dark);
        long jA8 = k6Var.a(context, R.color.system_secondary_container_dark);
        long jA9 = k6Var.a(context, R.color.system_on_secondary_container_dark);
        long jA10 = k6Var.a(context, R.color.system_tertiary_dark);
        long jA11 = k6Var.a(context, R.color.system_on_tertiary_dark);
        long jA12 = k6Var.a(context, R.color.system_tertiary_container_dark);
        long jA13 = k6Var.a(context, R.color.system_on_tertiary_container_dark);
        long jA14 = k6Var.a(context, R.color.system_background_dark);
        long jA15 = k6Var.a(context, R.color.system_on_background_dark);
        long jA16 = k6Var.a(context, R.color.system_surface_dark);
        long jA17 = k6Var.a(context, R.color.system_on_surface_dark);
        long jA18 = k6Var.a(context, R.color.system_surface_variant_dark);
        long jA19 = k6Var.a(context, R.color.system_on_surface_variant_dark);
        long jA20 = k6Var.a(context, R.color.system_surface_light);
        long jA21 = k6Var.a(context, R.color.system_on_surface_light);
        long jA22 = k6Var.a(context, R.color.system_outline_dark);
        long jA23 = k6Var.a(context, R.color.system_outline_variant_dark);
        long jA24 = k6Var.a(context, R.color.system_surface_bright_dark);
        long jA25 = k6Var.a(context, R.color.system_surface_dim_dark);
        return o6.m(jA, jA2, jA3, jA4, jA5, jA6, jA7, jA8, jA9, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, k6Var.a(context, R.color.system_primary_dark), jA20, jA21, 0L, 0L, 0L, 0L, jA22, jA23, 0L, jA24, k6Var.a(context, R.color.system_surface_container_dark), k6Var.a(context, R.color.system_surface_container_high_dark), k6Var.a(context, R.color.system_surface_container_highest_dark), k6Var.a(context, R.color.system_surface_container_low_dark), k6Var.a(context, R.color.system_surface_container_lowest_dark), jA25, k6Var.a(context, R.color.system_primary_fixed), k6Var.a(context, R.color.system_primary_fixed_dim), k6Var.a(context, R.color.system_on_primary_fixed), k6Var.a(context, R.color.system_on_primary_fixed_variant), k6Var.a(context, R.color.system_secondary_fixed), k6Var.a(context, R.color.system_secondary_fixed_dim), k6Var.a(context, R.color.system_on_secondary_fixed), k6Var.a(context, R.color.system_on_secondary_fixed_variant), k6Var.a(context, R.color.system_tertiary_fixed), k6Var.a(context, R.color.system_tertiary_fixed_dim), k6Var.a(context, R.color.system_on_tertiary_fixed), k6Var.a(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    @androidx.annotation.w0(31)
    @NotNull
    public static final l6 d(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 34 ? f(context) : e(g(context));
    }

    @androidx.annotation.w0(31)
    @NotNull
    public static final l6 e(@NotNull q80 q80Var) {
        long jB0 = q80Var.b0();
        long jY = q80Var.Y();
        long jG0 = q80Var.g0();
        long jX = q80Var.X();
        long jF0 = q80Var.f0();
        long jO0 = q80Var.o0();
        long jL0 = q80Var.l0();
        long jT0 = q80Var.t0();
        long jK0 = q80Var.k0();
        long jB1 = q80Var.B0();
        long jY0 = q80Var.y0();
        long jG1 = q80Var.G0();
        long jX0 = q80Var.x0();
        long jU = q80Var.U();
        long jZ = q80Var.z();
        long jU2 = q80Var.U();
        long jZ2 = q80Var.z();
        long jP = q80Var.P();
        long jG = q80Var.G();
        long jD = q80Var.D();
        long jS = q80Var.S();
        long J = q80Var.J();
        long jN = q80Var.N();
        long jY2 = q80Var.y();
        long jU3 = q80Var.U();
        long jO = q80Var.O();
        return o6.x(jB0, jY, jG0, jX, jF0, jO0, jL0, jT0, jK0, jB1, jY0, jG1, jX0, jU, jZ, jU2, jZ2, jP, jG, q80Var.b0(), jD, jS, 0L, 0L, 0L, 0L, J, jN, jY2, jU3, q80Var.R(), q80Var.Q(), q80Var.P(), q80Var.T(), q80Var.A(), jO, q80Var.g0(), q80Var.f0(), q80Var.X(), q80Var.a0(), q80Var.t0(), q80Var.s0(), q80Var.k0(), q80Var.n0(), q80Var.G0(), q80Var.F0(), q80Var.x0(), q80Var.A0(), 62914560, 0, null);
    }

    @androidx.annotation.w0(34)
    @NotNull
    public static final l6 f(@NotNull Context context) {
        k6 k6Var = k6.f30004a;
        long jA = k6Var.a(context, R.color.system_primary_light);
        long jA2 = k6Var.a(context, R.color.system_on_primary_light);
        long jA3 = k6Var.a(context, R.color.system_primary_container_light);
        long jA4 = k6Var.a(context, R.color.system_on_primary_container_light);
        long jA5 = k6Var.a(context, R.color.system_primary_dark);
        long jA6 = k6Var.a(context, R.color.system_secondary_light);
        long jA7 = k6Var.a(context, R.color.system_on_secondary_light);
        long jA8 = k6Var.a(context, R.color.system_secondary_container_light);
        long jA9 = k6Var.a(context, R.color.system_on_secondary_container_light);
        long jA10 = k6Var.a(context, R.color.system_tertiary_light);
        long jA11 = k6Var.a(context, R.color.system_on_tertiary_light);
        long jA12 = k6Var.a(context, R.color.system_tertiary_container_light);
        long jA13 = k6Var.a(context, R.color.system_on_tertiary_container_light);
        long jA14 = k6Var.a(context, R.color.system_background_light);
        long jA15 = k6Var.a(context, R.color.system_on_background_light);
        long jA16 = k6Var.a(context, R.color.system_surface_light);
        long jA17 = k6Var.a(context, R.color.system_on_surface_light);
        long jA18 = k6Var.a(context, R.color.system_surface_variant_light);
        long jA19 = k6Var.a(context, R.color.system_on_surface_variant_light);
        long jA20 = k6Var.a(context, R.color.system_surface_dark);
        long jA21 = k6Var.a(context, R.color.system_on_surface_dark);
        long jA22 = k6Var.a(context, R.color.system_outline_light);
        long jA23 = k6Var.a(context, R.color.system_outline_variant_light);
        long jA24 = k6Var.a(context, R.color.system_surface_bright_light);
        long jA25 = k6Var.a(context, R.color.system_surface_dim_light);
        return o6.x(jA, jA2, jA3, jA4, jA5, jA6, jA7, jA8, jA9, jA10, jA11, jA12, jA13, jA14, jA15, jA16, jA17, jA18, jA19, k6Var.a(context, R.color.system_primary_light), jA20, jA21, 0L, 0L, 0L, 0L, jA22, jA23, 0L, jA24, k6Var.a(context, R.color.system_surface_container_light), k6Var.a(context, R.color.system_surface_container_high_light), k6Var.a(context, R.color.system_surface_container_highest_light), k6Var.a(context, R.color.system_surface_container_low_light), k6Var.a(context, R.color.system_surface_container_lowest_light), jA25, k6Var.a(context, R.color.system_primary_fixed), k6Var.a(context, R.color.system_primary_fixed_dim), k6Var.a(context, R.color.system_on_primary_fixed), k6Var.a(context, R.color.system_on_primary_fixed_variant), k6Var.a(context, R.color.system_secondary_fixed), k6Var.a(context, R.color.system_secondary_fixed_dim), k6Var.a(context, R.color.system_on_secondary_fixed), k6Var.a(context, R.color.system_on_secondary_fixed_variant), k6Var.a(context, R.color.system_tertiary_fixed), k6Var.a(context, R.color.system_tertiary_fixed_dim), k6Var.a(context, R.color.system_on_tertiary_fixed), k6Var.a(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0, null);
    }

    @androidx.annotation.w0(31)
    @NotNull
    public static final q80 g(@NotNull Context context) {
        k6 k6Var = k6.f30004a;
        return new q80(k6Var.a(context, R.color.system_neutral1_0), k6Var.a(context, R.color.system_neutral1_10), h(k6Var.a(context, R.color.system_neutral1_600), 98.0f), h(k6Var.a(context, R.color.system_neutral1_600), 96.0f), k6Var.a(context, R.color.system_neutral1_50), h(k6Var.a(context, R.color.system_neutral1_600), 94.0f), h(k6Var.a(context, R.color.system_neutral1_600), 92.0f), k6Var.a(context, R.color.system_neutral1_100), h(k6Var.a(context, R.color.system_neutral1_600), 87.0f), k6Var.a(context, R.color.system_neutral1_200), k6Var.a(context, R.color.system_neutral1_300), k6Var.a(context, R.color.system_neutral1_400), k6Var.a(context, R.color.system_neutral1_500), k6Var.a(context, R.color.system_neutral1_600), k6Var.a(context, R.color.system_neutral1_700), h(k6Var.a(context, R.color.system_neutral1_600), 24.0f), h(k6Var.a(context, R.color.system_neutral1_600), 22.0f), k6Var.a(context, R.color.system_neutral1_800), h(k6Var.a(context, R.color.system_neutral1_600), 17.0f), h(k6Var.a(context, R.color.system_neutral1_600), 12.0f), k6Var.a(context, R.color.system_neutral1_900), h(k6Var.a(context, R.color.system_neutral1_600), 6.0f), h(k6Var.a(context, R.color.system_neutral1_600), 4.0f), k6Var.a(context, R.color.system_neutral1_1000), k6Var.a(context, R.color.system_neutral2_0), k6Var.a(context, R.color.system_neutral2_10), h(k6Var.a(context, R.color.system_neutral2_600), 98.0f), h(k6Var.a(context, R.color.system_neutral2_600), 96.0f), k6Var.a(context, R.color.system_neutral2_50), h(k6Var.a(context, R.color.system_neutral2_600), 94.0f), h(k6Var.a(context, R.color.system_neutral2_600), 92.0f), k6Var.a(context, R.color.system_neutral2_100), h(k6Var.a(context, R.color.system_neutral2_600), 87.0f), k6Var.a(context, R.color.system_neutral2_200), k6Var.a(context, R.color.system_neutral2_300), k6Var.a(context, R.color.system_neutral2_400), k6Var.a(context, R.color.system_neutral2_500), k6Var.a(context, R.color.system_neutral2_600), k6Var.a(context, R.color.system_neutral2_700), h(k6Var.a(context, R.color.system_neutral2_600), 24.0f), h(k6Var.a(context, R.color.system_neutral2_600), 22.0f), k6Var.a(context, R.color.system_neutral2_800), h(k6Var.a(context, R.color.system_neutral2_600), 17.0f), h(k6Var.a(context, R.color.system_neutral2_600), 12.0f), k6Var.a(context, R.color.system_neutral2_900), h(k6Var.a(context, R.color.system_neutral2_600), 6.0f), h(k6Var.a(context, R.color.system_neutral2_600), 4.0f), k6Var.a(context, R.color.system_neutral2_1000), k6Var.a(context, R.color.system_accent1_0), k6Var.a(context, R.color.system_accent1_10), k6Var.a(context, R.color.system_accent1_50), k6Var.a(context, R.color.system_accent1_100), k6Var.a(context, R.color.system_accent1_200), k6Var.a(context, R.color.system_accent1_300), k6Var.a(context, R.color.system_accent1_400), k6Var.a(context, R.color.system_accent1_500), k6Var.a(context, R.color.system_accent1_600), k6Var.a(context, R.color.system_accent1_700), k6Var.a(context, R.color.system_accent1_800), k6Var.a(context, R.color.system_accent1_900), k6Var.a(context, R.color.system_accent1_1000), k6Var.a(context, R.color.system_accent2_0), k6Var.a(context, R.color.system_accent2_10), k6Var.a(context, R.color.system_accent2_50), k6Var.a(context, R.color.system_accent2_100), k6Var.a(context, R.color.system_accent2_200), k6Var.a(context, R.color.system_accent2_300), k6Var.a(context, R.color.system_accent2_400), k6Var.a(context, R.color.system_accent2_500), k6Var.a(context, R.color.system_accent2_600), k6Var.a(context, R.color.system_accent2_700), k6Var.a(context, R.color.system_accent2_800), k6Var.a(context, R.color.system_accent2_900), k6Var.a(context, R.color.system_accent2_1000), k6Var.a(context, R.color.system_accent3_0), k6Var.a(context, R.color.system_accent3_10), k6Var.a(context, R.color.system_accent3_50), k6Var.a(context, R.color.system_accent3_100), k6Var.a(context, R.color.system_accent3_200), k6Var.a(context, R.color.system_accent3_300), k6Var.a(context, R.color.system_accent3_400), k6Var.a(context, R.color.system_accent3_500), k6Var.a(context, R.color.system_accent3_600), k6Var.a(context, R.color.system_accent3_700), k6Var.a(context, R.color.system_accent3_800), k6Var.a(context, R.color.system_accent3_900), k6Var.a(context, R.color.system_accent3_1000), null);
    }

    public static final long h(long j10, @androidx.annotation.x(from = 0.0d, to = d0.i1.f268246o) float f10) {
        double d10 = f10;
        if ((d10 < 1.0E-4d) || (d10 > 99.9999d)) {
            return androidx.compose.ui.graphics.s0.b(c0.b.f82345a.b(d10));
        }
        c0.a.C0799a c0799a = c0.a.f82331i;
        c0.a aVarB = c0799a.b(androidx.compose.ui.graphics.s0.t(j10));
        return androidx.compose.ui.graphics.s0.b(c0799a.f(aVarB.e(), aVarB.d(), f10));
    }
}
