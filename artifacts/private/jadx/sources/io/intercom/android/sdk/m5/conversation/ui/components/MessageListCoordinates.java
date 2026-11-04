package io.intercom.android.sdk.m5.conversation.ui.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class MessageListCoordinates {

    @NotNull
    private final n0.j boundsInParent;

    @NotNull
    private final n0.j boundsInWindow;
    private final long size;

    public /* synthetic */ MessageListCoordinates(n0.j jVar, n0.j jVar2, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, jVar2, j10);
    }

    /* JADX INFO: renamed from: copy-cSwnlzA$default, reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m230copycSwnlzA$default(MessageListCoordinates messageListCoordinates, n0.j jVar, n0.j jVar2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = messageListCoordinates.boundsInParent;
        }
        if ((i10 & 2) != 0) {
            jVar2 = messageListCoordinates.boundsInWindow;
        }
        if ((i10 & 4) != 0) {
            j10 = messageListCoordinates.size;
        }
        return messageListCoordinates.m232copycSwnlzA(jVar, jVar2, j10);
    }

    @NotNull
    public final n0.j component1() {
        return this.boundsInParent;
    }

    @NotNull
    public final n0.j component2() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: component3-NH-jbRc, reason: not valid java name */
    public final long m231component3NHjbRc() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-cSwnlzA, reason: not valid java name */
    public final MessageListCoordinates m232copycSwnlzA(@NotNull n0.j boundsInParent, @NotNull n0.j boundsInWindow, long j10) {
        Intrinsics.checkNotNullParameter(boundsInParent, "boundsInParent");
        Intrinsics.checkNotNullParameter(boundsInWindow, "boundsInWindow");
        return new MessageListCoordinates(boundsInParent, boundsInWindow, j10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageListCoordinates)) {
            return false;
        }
        MessageListCoordinates messageListCoordinates = (MessageListCoordinates) obj;
        return Intrinsics.areEqual(this.boundsInParent, messageListCoordinates.boundsInParent) && Intrinsics.areEqual(this.boundsInWindow, messageListCoordinates.boundsInWindow) && n0.n.k(this.size, messageListCoordinates.size);
    }

    @NotNull
    public final n0.j getBoundsInParent() {
        return this.boundsInParent;
    }

    @NotNull
    public final n0.j getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m233getSizeNHjbRc() {
        return this.size;
    }

    public int hashCode() {
        return (((this.boundsInParent.hashCode() * 31) + this.boundsInWindow.hashCode()) * 31) + n0.n.u(this.size);
    }

    public final boolean isZero() {
        return Intrinsics.areEqual(this.boundsInParent, n0.j.f332705e.a()) && n0.n.k(this.size, n0.n.f332724b.c());
    }

    @NotNull
    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + ((Object) n0.n.x(this.size)) + ')';
    }

    private MessageListCoordinates(n0.j boundsInParent, n0.j boundsInWindow, long j10) {
        Intrinsics.checkNotNullParameter(boundsInParent, "boundsInParent");
        Intrinsics.checkNotNullParameter(boundsInWindow, "boundsInWindow");
        this.boundsInParent = boundsInParent;
        this.boundsInWindow = boundsInWindow;
        this.size = j10;
    }

    public /* synthetic */ MessageListCoordinates(n0.j jVar, n0.j jVar2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? n0.j.f332705e.a() : jVar, (i10 & 2) != 0 ? n0.j.f332705e.a() : jVar2, (i10 & 4) != 0 ? n0.n.f332724b.c() : j10, null);
    }
}
