package com.segment.analytics.kotlin.core.platform.plugins;

import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SegmentSettings {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f266895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f266896b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SegmentSettings> serializer() {
            return SegmentSettings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ SegmentSettings(int i10, String str, String str2, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, SegmentSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.f266895a = str;
        if ((i10 & 2) == 0) {
            this.f266896b = null;
        } else {
            this.f266896b = str2;
        }
    }

    public static /* synthetic */ SegmentSettings d(SegmentSettings segmentSettings, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = segmentSettings.f266895a;
        }
        if ((i10 & 2) != 0) {
            str2 = segmentSettings.f266896b;
        }
        return segmentSettings.c(str, str2);
    }

    @oj.n
    public static final void i(@NotNull SegmentSettings self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f266895a);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.f266896b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, b3.f315897a, self.f266896b);
    }

    @NotNull
    public final String a() {
        return this.f266895a;
    }

    @Nullable
    public final String b() {
        return this.f266896b;
    }

    @NotNull
    public final SegmentSettings c(@NotNull String apiKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        return new SegmentSettings(apiKey, str);
    }

    @Nullable
    public final String e() {
        return this.f266896b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentSettings)) {
            return false;
        }
        SegmentSettings segmentSettings = (SegmentSettings) obj;
        return Intrinsics.areEqual(this.f266895a, segmentSettings.f266895a) && Intrinsics.areEqual(this.f266896b, segmentSettings.f266896b);
    }

    @NotNull
    public final String f() {
        return this.f266895a;
    }

    public final void g(@Nullable String str) {
        this.f266896b = str;
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266895a = str;
    }

    public int hashCode() {
        int iHashCode = this.f266895a.hashCode() * 31;
        String str = this.f266896b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SegmentSettings(apiKey=" + this.f266895a + ", apiHost=" + this.f266896b + ')';
    }

    public SegmentSettings(@NotNull String apiKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f266895a = apiKey;
        this.f266896b = str;
    }

    public /* synthetic */ SegmentSettings(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
