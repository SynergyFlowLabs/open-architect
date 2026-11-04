package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.ja0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.style.u;
import androidx.compose.ui.text.y3;
import androidx.compose.ui.unit.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomTypographyKt {

    @NotNull
    private static final m4<IntercomTypography> LocalIntercomTypography = a1.m(new Function0() { // from class: io.intercom.android.sdk.ui.theme.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomTypographyKt.defaultIntercomTypography();
        }
    });

    @NotNull
    public static final IntercomTypography defaultIntercomTypography() {
        long jM = a0.m(32);
        long jM2 = a0.m(48);
        v0.a aVar = v0.f41742b;
        return new IntercomTypography(new y3(0L, jM, aVar.c(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, jM2, (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(28), aVar.o(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(32), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(20), aVar.o(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(24), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(16), aVar.m(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(20), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(16), aVar.o(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(20), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(14), aVar.m(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(18), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null), new y3(0L, a0.m(12), aVar.m(), (q0) null, (r0) null, (y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (f) null, 0L, (k) null, (o3) null, (i) null, 0, 0, a0.m(18), (s) null, (androidx.compose.ui.text.a1) null, (h) null, 0, 0, (u) null, 16646137, (DefaultConstructorMarker) null));
    }

    @NotNull
    public static final m4<IntercomTypography> getLocalIntercomTypography() {
        return LocalIntercomTypography;
    }

    @NotNull
    public static final ja0 toMaterialTypography(@NotNull IntercomTypography intercomTypography) {
        Intrinsics.checkNotNullParameter(intercomTypography, "<this>");
        ja0 ja0Var = new ja0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        return ja0Var.a((23039 & 1) != 0 ? ja0Var.f29721a : null, (23039 & 2) != 0 ? ja0Var.f29722b : null, (23039 & 4) != 0 ? ja0Var.f29723c : null, (23039 & 8) != 0 ? ja0Var.f29724d : null, (23039 & 16) != 0 ? ja0Var.f29725e : null, (23039 & 32) != 0 ? ja0Var.f29726f : null, (23039 & 64) != 0 ? ja0Var.f29727g : null, (23039 & 128) != 0 ? ja0Var.f29728h : null, (23039 & 256) != 0 ? ja0Var.f29729i : null, (23039 & 512) != 0 ? ja0Var.f29730j : intercomTypography.getType04(), (23039 & 1024) != 0 ? ja0Var.f29731k : intercomTypography.getType04Point5(), (23039 & 2048) != 0 ? ja0Var.f29732l : null, (23039 & 4096) != 0 ? ja0Var.f29733m : null, (23039 & 8192) != 0 ? ja0Var.f29734n : intercomTypography.getType05(), (23039 & 16384) != 0 ? ja0Var.f29735o : null);
    }
}
