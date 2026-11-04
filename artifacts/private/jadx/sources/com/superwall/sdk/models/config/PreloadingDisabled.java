package com.superwall.sdk.models.config;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PreloadingDisabled {
    private final boolean all;

    @NotNull
    private final Set<String> triggers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new g1(b3.f315897a)};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PreloadingDisabled> serializer() {
            return PreloadingDisabled$$serializer.INSTANCE;
        }

        @NotNull
        public final PreloadingDisabled stub() {
            return new PreloadingDisabled(false, SetsKt.emptySet());
        }

        private Companion() {
        }
    }

    public /* synthetic */ PreloadingDisabled(int i10, boolean z10, Set set, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, PreloadingDisabled$$serializer.INSTANCE.getDescriptor());
        }
        this.all = z10;
        this.triggers = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreloadingDisabled copy$default(PreloadingDisabled preloadingDisabled, boolean z10, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = preloadingDisabled.all;
        }
        if ((i10 & 2) != 0) {
            set = preloadingDisabled.triggers;
        }
        return preloadingDisabled.copy(z10, set);
    }

    @a0("all")
    public static /* synthetic */ void getAll$annotations() {
    }

    @a0("triggers")
    public static /* synthetic */ void getTriggers$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PreloadingDisabled preloadingDisabled, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeBooleanElement(serialDescriptor, 0, preloadingDisabled.all);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], preloadingDisabled.triggers);
    }

    public final boolean component1() {
        return this.all;
    }

    @NotNull
    public final Set<String> component2() {
        return this.triggers;
    }

    @NotNull
    public final PreloadingDisabled copy(boolean z10, @NotNull Set<String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        return new PreloadingDisabled(z10, triggers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadingDisabled)) {
            return false;
        }
        PreloadingDisabled preloadingDisabled = (PreloadingDisabled) obj;
        if (this.all == preloadingDisabled.all && Intrinsics.areEqual(this.triggers, preloadingDisabled.triggers)) {
            return true;
        }
        return false;
    }

    public final boolean getAll() {
        return this.all;
    }

    @NotNull
    public final Set<String> getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.all) * 31) + this.triggers.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreloadingDisabled(all=" + this.all + ", triggers=" + this.triggers + ")";
    }

    public PreloadingDisabled(boolean z10, @NotNull Set<String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        this.all = z10;
        this.triggers = triggers;
    }
}
