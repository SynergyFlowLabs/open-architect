package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0
public final class ProcessData {

    @NotNull
    public static final ProcessData$$b Companion = new ProcessData$$b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f124823b;

    public /* synthetic */ ProcessData(int i10, int i11, String str, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, ProcessData$$a.f124824a.getDescriptor());
        }
        this.f124822a = i11;
        this.f124823b = str;
    }

    public static /* synthetic */ ProcessData d(ProcessData processData, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = processData.f124822a;
        }
        if ((i11 & 2) != 0) {
            str = processData.f124823b;
        }
        return processData.c(i10, str);
    }

    @oj.n
    public static final /* synthetic */ void g(ProcessData processData, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeIntElement(serialDescriptor, 0, processData.f124822a);
        eVar.encodeStringElement(serialDescriptor, 1, processData.f124823b);
    }

    public final int a() {
        return this.f124822a;
    }

    @NotNull
    public final String b() {
        return this.f124823b;
    }

    @NotNull
    public final ProcessData c(int i10, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new ProcessData(i10, uuid);
    }

    public final int e() {
        return this.f124822a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) obj;
        return this.f124822a == processData.f124822a && Intrinsics.areEqual(this.f124823b, processData.f124823b);
    }

    @NotNull
    public final String f() {
        return this.f124823b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f124822a) * 31) + this.f124823b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProcessData(pid=" + this.f124822a + ", uuid=" + this.f124823b + ')';
    }

    public ProcessData(int i10, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f124822a = i10;
        this.f124823b = uuid;
    }
}
