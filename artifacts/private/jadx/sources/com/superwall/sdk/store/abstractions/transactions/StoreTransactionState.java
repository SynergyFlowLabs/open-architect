package com.superwall.sdk.store.abstractions.transactions;

import com.superwall.sdk.store.abstractions.transactions.StoreTransactionState;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = StoreTransactionStateSerializer.class)
public abstract class StoreTransactionState {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoreTransactionState from(int i10) {
            if (i10 == 0) {
                return Purchased.INSTANCE;
            }
            if (i10 != 1) {
                return i10 != 7 ? Failed.INSTANCE : Restored.INSTANCE;
            }
            return Purchasing.INSTANCE;
        }

        @NotNull
        public final KSerializer<StoreTransactionState> serializer() {
            return StoreTransactionStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @b0
    public static final class Deferred extends StoreTransactionState {

        @NotNull
        public static final Deferred INSTANCE = new Deferred();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: eg.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreTransactionState.Deferred._init_$_anonymous_();
            }
        });

        private Deferred() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState.Deferred", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Deferred> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Failed extends StoreTransactionState {

        @NotNull
        public static final Failed INSTANCE = new Failed();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: eg.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreTransactionState.Failed._init_$_anonymous_();
            }
        });

        private Failed() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState.Failed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Failed> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Purchased extends StoreTransactionState {

        @NotNull
        public static final Purchased INSTANCE = new Purchased();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: eg.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreTransactionState.Purchased._init_$_anonymous_();
            }
        });

        private Purchased() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState.Purchased", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Purchased> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Purchasing extends StoreTransactionState {

        @NotNull
        public static final Purchasing INSTANCE = new Purchasing();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: eg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreTransactionState.Purchasing._init_$_anonymous_();
            }
        });

        private Purchasing() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState.Purchasing", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Purchasing> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Restored extends StoreTransactionState {

        @NotNull
        public static final Restored INSTANCE = new Restored();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: eg.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreTransactionState.Restored._init_$_anonymous_();
            }
        });

        private Restored() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState.Restored", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Restored> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ StoreTransactionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StoreTransactionState() {
    }
}
