package com.superwall.sdk.models.transactions;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SavedTransaction {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long date;
    private final boolean hasExternalPurchaseController;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267446id;
    private final boolean isExternal;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SavedTransaction> serializer() {
            return SavedTransaction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SavedTransaction(int i10, String str, long j10, boolean z10, boolean z11, v2 v2Var) {
        if (15 != (i10 & 15)) {
            g2.b(i10, 15, SavedTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.f267446id = str;
        this.date = j10;
        this.hasExternalPurchaseController = z10;
        this.isExternal = z11;
    }

    @a0(AttributeType.DATE)
    public static /* synthetic */ void getDate$annotations() {
    }

    @a0("hasExternalPurchaseController")
    public static /* synthetic */ void getHasExternalPurchaseController$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("isExternal")
    public static /* synthetic */ void isExternal$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(SavedTransaction savedTransaction, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, savedTransaction.f267446id);
        eVar.encodeLongElement(serialDescriptor, 1, savedTransaction.date);
        eVar.encodeBooleanElement(serialDescriptor, 2, savedTransaction.hasExternalPurchaseController);
        eVar.encodeBooleanElement(serialDescriptor, 3, savedTransaction.isExternal);
    }

    public final long getDate() {
        return this.date;
    }

    public final boolean getHasExternalPurchaseController() {
        return this.hasExternalPurchaseController;
    }

    @NotNull
    public final String getId() {
        return this.f267446id;
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public SavedTransaction(@NotNull String id2, long j10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f267446id = id2;
        this.date = j10;
        this.hasExternalPurchaseController = z10;
        this.isExternal = z11;
    }
}
