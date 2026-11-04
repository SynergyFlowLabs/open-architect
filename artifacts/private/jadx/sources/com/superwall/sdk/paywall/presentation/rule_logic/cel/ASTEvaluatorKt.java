package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.MappingKt;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELExpression;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELMember;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nASTEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ASTEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/ASTEvaluatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 ASTEvaluator.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/ASTEvaluatorKt\n*L\n76#1:101\n76#1:102,3\n*E\n"})
public final class ASTEvaluatorKt {
    @NotNull
    public static final CELExpression rewriteASTWith(@NotNull CELExpression cELExpression, @NotNull final Function2<? super String, ? super List<? extends PassableValue>, ? extends PassableValue> ctx) {
        Intrinsics.checkNotNullParameter(cELExpression, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return cELExpression.mapAll(new Function1() { // from class: com.superwall.sdk.paywall.presentation.rule_logic.cel.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ASTEvaluatorKt.rewriteASTWith$lambda$1(ctx, (CELExpression) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CELExpression rewriteASTWith$lambda$1(Function2 function2, CELExpression it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof CELExpression.FunctionCall) {
            CELExpression.FunctionCall functionCall = (CELExpression.FunctionCall) it;
            CELExpression function = functionCall.getFunction();
            if ((function instanceof CELExpression.Ident) && (functionCall.getReceiver() instanceof CELExpression.Ident) && Intrinsics.areEqual(((CELExpression.Ident) functionCall.getReceiver()).getName(), "platform")) {
                String name = ((CELExpression.Ident) function).getName();
                List<CELExpression> arguments = functionCall.getArguments();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
                Iterator<T> it2 = arguments.iterator();
                while (it2.hasNext()) {
                    arrayList.add(MappingKt.toPassableValue((CELExpression) it2.next()));
                }
                return MappingKt.toCELExpression((PassableValue) function2.invoke(name, arrayList));
            }
        } else if (it instanceof CELExpression.Member) {
            CELExpression.Member member = (CELExpression.Member) it;
            boolean z10 = (member.getExpr() instanceof CELExpression.Ident) && Intrinsics.areEqual(((CELExpression.Ident) member.getExpr()).getName(), "platform");
            boolean z11 = member.getMember() instanceof CELMember.Attribute;
            if (z10 && z11) {
                CELMember member2 = member.getMember();
                Intrinsics.checkNotNull(member2, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELMember.Attribute");
                return MappingKt.toCELExpression((PassableValue) function2.invoke(((CELMember.Attribute) member2).getName(), CollectionsKt.emptyList()));
            }
        }
        return it;
    }
}
