package com.sdk.growthbook.serializable_model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SerializableGBTrackData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private SerializableGBExperiment f266477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private SerializableGBExperimentResult f266478b;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableGBTrackData> serializer() {
            return SerializableGBTrackData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SerializableGBTrackData(int i10, SerializableGBExperiment serializableGBExperiment, SerializableGBExperimentResult serializableGBExperimentResult, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, SerializableGBTrackData$$serializer.INSTANCE.getDescriptor());
        }
        this.f266477a = serializableGBExperiment;
        this.f266478b = serializableGBExperimentResult;
    }

    public static /* synthetic */ SerializableGBTrackData d(SerializableGBTrackData serializableGBTrackData, SerializableGBExperiment serializableGBExperiment, SerializableGBExperimentResult serializableGBExperimentResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            serializableGBExperiment = serializableGBTrackData.f266477a;
        }
        if ((i10 & 2) != 0) {
            serializableGBExperimentResult = serializableGBTrackData.f266478b;
        }
        return serializableGBTrackData.c(serializableGBExperiment, serializableGBExperimentResult);
    }

    @n
    public static final /* synthetic */ void i(SerializableGBTrackData serializableGBTrackData, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, SerializableGBExperiment$$serializer.INSTANCE, serializableGBTrackData.f266477a);
        eVar.encodeSerializableElement(serialDescriptor, 1, SerializableGBExperimentResult$$serializer.INSTANCE, serializableGBTrackData.f266478b);
    }

    @NotNull
    public final SerializableGBExperiment a() {
        return this.f266477a;
    }

    @NotNull
    public final SerializableGBExperimentResult b() {
        return this.f266478b;
    }

    @NotNull
    public final SerializableGBTrackData c(@NotNull SerializableGBExperiment experiment, @NotNull SerializableGBExperimentResult result) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(result, "result");
        return new SerializableGBTrackData(experiment, result);
    }

    @NotNull
    public final SerializableGBExperiment e() {
        return this.f266477a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableGBTrackData)) {
            return false;
        }
        SerializableGBTrackData serializableGBTrackData = (SerializableGBTrackData) obj;
        return Intrinsics.areEqual(this.f266477a, serializableGBTrackData.f266477a) && Intrinsics.areEqual(this.f266478b, serializableGBTrackData.f266478b);
    }

    @NotNull
    public final SerializableGBExperimentResult f() {
        return this.f266478b;
    }

    public final void g(@NotNull SerializableGBExperiment serializableGBExperiment) {
        Intrinsics.checkNotNullParameter(serializableGBExperiment, "<set-?>");
        this.f266477a = serializableGBExperiment;
    }

    public final void h(@NotNull SerializableGBExperimentResult serializableGBExperimentResult) {
        Intrinsics.checkNotNullParameter(serializableGBExperimentResult, "<set-?>");
        this.f266478b = serializableGBExperimentResult;
    }

    public int hashCode() {
        return (this.f266477a.hashCode() * 31) + this.f266478b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SerializableGBTrackData(experiment=" + this.f266477a + ", result=" + this.f266478b + ")";
    }

    public SerializableGBTrackData(@NotNull SerializableGBExperiment experiment, @NotNull SerializableGBExperimentResult result) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f266477a = experiment;
        this.f266478b = result;
    }
}
