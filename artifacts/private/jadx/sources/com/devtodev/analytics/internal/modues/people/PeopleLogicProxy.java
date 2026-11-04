package com.devtodev.analytics.internal.modues.people;

import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.validator.PeopleValidatorRules;
import com.devtodev.analytics.internal.validator.Validator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleLogicProxy implements IPeopleLogicProxy {

    @Nullable
    private IPeopleLogic peopleLogic;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$clearUser$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $methodName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$methodName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPeopleLogic iPeopleLogic;
            if (PeopleLogicProxy.this.validateInitialization(this.$methodName) && (iPeopleLogic = PeopleLogicProxy.this.peopleLogic) != null) {
                iPeopleLogic.clearUser();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$getValue$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nPeopleLogicProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleLogicProxy.kt\ncom/devtodev/analytics/internal/modues/people/PeopleLogicProxy$getValue$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
    public static final class C25921 extends l0 implements Function0<Unit> {
        final /* synthetic */ Function1<PeopleParameter, Unit> $completionHandler;
        final /* synthetic */ String $key;
        final /* synthetic */ String $methodName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25921(String str, Function1<? super PeopleParameter, Unit> function1, String str2) {
            super(0);
            this.$methodName = str;
            this.$completionHandler = function1;
            this.$key = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (!PeopleLogicProxy.this.validateInitialization(this.$methodName)) {
                this.$completionHandler.invoke(null);
                return;
            }
            String strValidateKey = PeopleValidatorRules.INSTANCE.validateKey(this.$methodName, this.$key);
            if (strValidateKey == null) {
                this.$completionHandler.invoke(null);
                return;
            }
            PeopleReservedKeys peopleReservedKeysContains = PeopleReservedKeys.Companion.contains(strValidateKey);
            if (peopleReservedKeysContains != null) {
                strValidateKey = peopleReservedKeysContains.getValue();
            }
            if (strValidateKey != null) {
                PeopleLogicProxy peopleLogicProxy = PeopleLogicProxy.this;
                Function1<PeopleParameter, Unit> function1 = this.$completionHandler;
                IPeopleLogic iPeopleLogic = peopleLogicProxy.peopleLogic;
                if (iPeopleLogic != null) {
                    iPeopleLogic.getValue(strValidateKey, function1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$increment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25931 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $methodName;
        final /* synthetic */ PeopleParameter $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25931(String str, String str2, PeopleParameter peopleParameter) {
            super(0);
            this.$methodName = str;
            this.$key = str2;
            this.$value = peopleParameter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PeopleValidatorRules.ValidPeopleParameter validPeopleParameterValidateChanges;
            IPeopleLogic iPeopleLogic;
            if (!PeopleLogicProxy.this.validateInitialization(this.$methodName) || (validPeopleParameterValidateChanges = PeopleLogicProxy.this.validateChanges(this.$key, this.$value, this.$methodName)) == null || (iPeopleLogic = PeopleLogicProxy.this.peopleLogic) == null) {
                return;
            }
            iPeopleLogic.increment(validPeopleParameterValidateChanges.getKey(), validPeopleParameterValidateChanges.getPeopleParameter());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$setReservedValue$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25941 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $methodName;
        final /* synthetic */ PeopleParameter $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25941(String str, String str2, PeopleParameter peopleParameter) {
            super(0);
            this.$methodName = str;
            this.$key = str2;
            this.$value = peopleParameter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PeopleValidatorRules.ValidPeopleParameter validPeopleParameterValidateSet;
            IPeopleLogic iPeopleLogic;
            if (PeopleLogicProxy.this.validateInitialization(this.$methodName) && (validPeopleParameterValidateSet = PeopleValidatorRules.INSTANCE.validateSet(this.$methodName, this.$key, this.$value)) != null && !Validator.INSTANCE.isExcluded("pl", validPeopleParameterValidateSet.getKey()) && (iPeopleLogic = PeopleLogicProxy.this.peopleLogic) != null) {
                iPeopleLogic.setValue(validPeopleParameterValidateSet.getKey(), validPeopleParameterValidateSet.getPeopleParameter());
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$setValue$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25951 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $methodName;
        final /* synthetic */ PeopleParameter $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25951(String str, String str2, PeopleParameter peopleParameter) {
            super(0);
            this.$methodName = str;
            this.$key = str2;
            this.$value = peopleParameter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PeopleValidatorRules.ValidPeopleParameter validPeopleParameterValidateChanges;
            IPeopleLogic iPeopleLogic;
            if (!PeopleLogicProxy.this.validateInitialization(this.$methodName) || (validPeopleParameterValidateChanges = PeopleLogicProxy.this.validateChanges(this.$key, this.$value, this.$methodName)) == null || (iPeopleLogic = PeopleLogicProxy.this.peopleLogic) == null) {
                return;
            }
            iPeopleLogic.setValue(validPeopleParameterValidateChanges.getKey(), validPeopleParameterValidateChanges.getPeopleParameter());
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogicProxy$unset$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nPeopleLogicProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleLogicProxy.kt\ncom/devtodev/analytics/internal/modues/people/PeopleLogicProxy$unset$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n1855#2,2:133\n*S KotlinDebug\n*F\n+ 1 PeopleLogicProxy.kt\ncom/devtodev/analytics/internal/modues/people/PeopleLogicProxy$unset$1\n*L\n79#1:131,2\n89#1:133,2\n*E\n"})
    public static final class C25961 extends l0 implements Function0<Unit> {
        final /* synthetic */ String $methodName;
        final /* synthetic */ List<String> $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25961(String str, List<String> list) {
            super(0);
            this.$methodName = str;
            this.$properties = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IPeopleLogic iPeopleLogic;
            if (PeopleLogicProxy.this.validateInitialization(this.$methodName)) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.$properties) {
                    PeopleReservedKeys peopleReservedKeysContains = PeopleReservedKeys.Companion.contains(str);
                    if (peopleReservedKeysContains != null) {
                        arrayList.add(peopleReservedKeysContains.getValue());
                    } else {
                        arrayList.add(str);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : PeopleValidatorRules.INSTANCE.validateUnset(this.$methodName, arrayList)) {
                    if (!Validator.INSTANCE.isExcluded("pl", str2)) {
                        arrayList2.add(str2);
                    }
                }
                if (!arrayList2.isEmpty() && (iPeopleLogic = PeopleLogicProxy.this.peopleLogic) != null) {
                    iPeopleLogic.unset(arrayList2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PeopleValidatorRules.ValidPeopleParameter validateChanges(String str, PeopleParameter peopleParameter, String str2) {
        PeopleReservedKeys peopleReservedKeysContains = PeopleReservedKeys.Companion.contains(str);
        if (peopleReservedKeysContains != null) {
            str = peopleReservedKeysContains.getValue();
            if (!PeopleValidatorRules.INSTANCE.validateReservedValueType(peopleReservedKeysContains, peopleParameter)) {
                return null;
            }
        }
        PeopleValidatorRules.ValidPeopleParameter validPeopleParameterValidateSet = PeopleValidatorRules.INSTANCE.validateSet(str2, str, peopleParameter);
        if (Validator.INSTANCE.isExcluded("pl", str)) {
            return null;
        }
        return validPeopleParameterValidateSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validateInitialization(String str) {
        if (this.peopleLogic != null) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, "In the " + str + " method an error has occurred: The SDK is not initialized yet!", null, 2, null);
        return false;
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void clearUser(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        QueueManager.Companion.runIncoming(new AnonymousClass1(methodName));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void getValue(@NotNull String methodName, @NotNull String key, @NotNull Function1<? super PeopleParameter, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        QueueManager.Companion.runIncoming(new C25921(methodName, completionHandler, key));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void increment(@NotNull String methodName, @NotNull String key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        QueueManager.Companion.runIncoming(new C25931(methodName, key, value));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void initialize(@NotNull IPeopleLogic peopleLogic) {
        Intrinsics.checkNotNullParameter(peopleLogic, "peopleLogic");
        this.peopleLogic = peopleLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void setReservedValue(@NotNull String methodName, @NotNull String key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        QueueManager.Companion.runIncoming(new C25941(methodName, key, value));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void setValue(@NotNull String methodName, @NotNull String key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        QueueManager.Companion.runIncoming(new C25951(methodName, key, value));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogicProxy
    public void unset(@NotNull String methodName, @NotNull List<String> properties) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(properties, "properties");
        QueueManager.Companion.runIncoming(new C25961(methodName, properties));
    }
}
