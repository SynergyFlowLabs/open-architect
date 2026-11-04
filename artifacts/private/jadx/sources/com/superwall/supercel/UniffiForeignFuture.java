package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"handle", "free"})
public class UniffiForeignFuture extends Structure {

    @f
    @Nullable
    public UniffiForeignFutureFree free;

    @f
    public long handle;

    public static final class UniffiByValue extends UniffiForeignFuture implements Structure.ByValue {
        public UniffiByValue() {
            this(0L, null, 3, null);
        }

        public /* synthetic */ UniffiByValue(long j10, UniffiForeignFutureFree uniffiForeignFutureFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : uniffiForeignFutureFree);
        }

        public UniffiByValue(long j10, @Nullable UniffiForeignFutureFree uniffiForeignFutureFree) {
            super(j10, uniffiForeignFutureFree);
        }
    }

    public UniffiForeignFuture() {
        this(0L, null, 3, null);
    }

    public final void uniffiSetValue$supercel_release(@NotNull UniffiForeignFuture other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.handle = other.handle;
        this.free = other.free;
    }

    public /* synthetic */ UniffiForeignFuture(long j10, UniffiForeignFutureFree uniffiForeignFutureFree, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : uniffiForeignFutureFree);
    }

    public UniffiForeignFuture(long j10, @Nullable UniffiForeignFutureFree uniffiForeignFutureFree) {
        this.handle = j10;
        this.free = uniffiForeignFutureFree;
    }
}
