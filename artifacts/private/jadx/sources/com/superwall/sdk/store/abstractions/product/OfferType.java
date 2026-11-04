package com.superwall.sdk.store.abstractions.product;

import com.superwall.sdk.store.abstractions.product.OfferType;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class OfferType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: dg.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfferType._init_$_anonymous_();
        }
    });

    public static final class Auto extends OfferType {

        @NotNull
        public static final Auto INSTANCE = new Auto();

        private Auto() {
            super(null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) OfferType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<OfferType> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class Offer extends OfferType {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f267529id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offer(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f267529id = id2;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = offer.f267529id;
            }
            return offer.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f267529id;
        }

        @NotNull
        public final Offer copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Offer(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Offer) && Intrinsics.areEqual(this.f267529id, ((Offer) obj).f267529id);
        }

        @Override // com.superwall.sdk.store.abstractions.product.OfferType
        @NotNull
        public String getId() {
            return this.f267529id;
        }

        public int hashCode() {
            return this.f267529id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Offer(id=" + this.f267529id + ")";
        }
    }

    public /* synthetic */ OfferType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.store.abstractions.product.OfferType", j1.d(OfferType.class), new d[0], new KSerializer[0], new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(OfferType offerType, e eVar, SerialDescriptor serialDescriptor) {
    }

    @Nullable
    public String getId() {
        if (this instanceof Offer) {
            return ((Offer) this).getId();
        }
        return null;
    }

    private OfferType() {
    }

    public /* synthetic */ OfferType(int i10, v2 v2Var) {
    }
}
