package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELRelationOp;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.m;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
@m
@a0("CELRelationOp")
public abstract class CELRelationOp implements ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELRelationOp._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELRelationOp.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELRelationOp> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("Equals")
    public static final class Equals extends CELRelationOp {

        @NotNull
        public static final Equals INSTANCE = new Equals();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.Equals._init_$_anonymous_();
            }
        });

        private Equals() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Equals", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Equals> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "==";
        }
    }

    @b0
    @a0("GreaterThan")
    public static final class GreaterThan extends CELRelationOp {

        @NotNull
        public static final GreaterThan INSTANCE = new GreaterThan();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.GreaterThan._init_$_anonymous_();
            }
        });

        private GreaterThan() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("GreaterThan", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<GreaterThan> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return ">";
        }
    }

    @b0
    @a0("GreaterThanEq")
    public static final class GreaterThanEq extends CELRelationOp {

        @NotNull
        public static final GreaterThanEq INSTANCE = new GreaterThanEq();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.GreaterThanEq._init_$_anonymous_();
            }
        });

        private GreaterThanEq() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("GreaterThanEq", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<GreaterThanEq> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return ">=";
        }
    }

    @b0
    @a0("In")
    public static final class In extends CELRelationOp {

        @NotNull
        public static final In INSTANCE = new In();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.In._init_$_anonymous_();
            }
        });

        private In() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i10 = 7 | 0;
            return new z1("In", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<In> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "in";
        }
    }

    @b0
    @a0("LessThan")
    public static final class LessThan extends CELRelationOp {

        @NotNull
        public static final LessThan INSTANCE = new LessThan();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.LessThan._init_$_anonymous_();
            }
        });

        private LessThan() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("LessThan", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<LessThan> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "<";
        }
    }

    @b0
    @a0("LessThanEq")
    public static final class LessThanEq extends CELRelationOp {

        @NotNull
        public static final LessThanEq INSTANCE = new LessThanEq();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.LessThanEq._init_$_anonymous_();
            }
        });

        private LessThanEq() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("LessThanEq", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<LessThanEq> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "<=";
        }
    }

    @b0
    @a0("NotEquals")
    public static final class NotEquals extends CELRelationOp {

        @NotNull
        public static final NotEquals INSTANCE = new NotEquals();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELRelationOp.NotEquals._init_$_anonymous_();
            }
        });

        private NotEquals() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("NotEquals", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<NotEquals> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "!=";
        }
    }

    public /* synthetic */ CELRelationOp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELRelationOp", j1.d(CELRelationOp.class), new d[]{j1.d(Equals.class), j1.d(GreaterThan.class), j1.d(GreaterThanEq.class), j1.d(In.class), j1.d(LessThan.class), j1.d(LessThanEq.class), j1.d(NotEquals.class)}, new KSerializer[]{new z1("Equals", Equals.INSTANCE, new Annotation[0]), new z1("GreaterThan", GreaterThan.INSTANCE, new Annotation[0]), new z1("GreaterThanEq", GreaterThanEq.INSTANCE, new Annotation[0]), new z1("In", In.INSTANCE, new Annotation[0]), new z1("LessThan", LessThan.INSTANCE, new Annotation[0]), new z1("LessThanEq", LessThanEq.INSTANCE, new Annotation[0]), new z1("NotEquals", NotEquals.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELRelationOp cELRelationOp, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELRelationOp() {
    }

    public /* synthetic */ CELRelationOp(int i10, v2 v2Var) {
    }
}
