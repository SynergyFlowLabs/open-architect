package com.devtodev.analytics.internal.validator;

import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterDouble;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterLong;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterString;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleValidatorRules {

    @NotNull
    public static final PeopleValidatorRules INSTANCE = new PeopleValidatorRules();

    public static final class ValidPeopleParameter {

        @NotNull
        private final String key;

        @NotNull
        private final PeopleParameter peopleParameter;

        public ValidPeopleParameter(@NotNull String key, @NotNull PeopleParameter peopleParameter) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(peopleParameter, "peopleParameter");
            this.key = key;
            this.peopleParameter = peopleParameter;
        }

        public static /* synthetic */ ValidPeopleParameter copy$default(ValidPeopleParameter validPeopleParameter, String str, PeopleParameter peopleParameter, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = validPeopleParameter.key;
            }
            if ((i10 & 2) != 0) {
                peopleParameter = validPeopleParameter.peopleParameter;
            }
            return validPeopleParameter.copy(str, peopleParameter);
        }

        @NotNull
        public final String component1() {
            return this.key;
        }

        @NotNull
        public final PeopleParameter component2() {
            return this.peopleParameter;
        }

        @NotNull
        public final ValidPeopleParameter copy(@NotNull String key, @NotNull PeopleParameter peopleParameter) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(peopleParameter, "peopleParameter");
            return new ValidPeopleParameter(key, peopleParameter);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidPeopleParameter)) {
                return false;
            }
            ValidPeopleParameter validPeopleParameter = (ValidPeopleParameter) obj;
            return Intrinsics.areEqual(this.key, validPeopleParameter.key) && Intrinsics.areEqual(this.peopleParameter, validPeopleParameter.peopleParameter);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final PeopleParameter getPeopleParameter() {
            return this.peopleParameter;
        }

        public int hashCode() {
            return this.peopleParameter.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ValidPeopleParameter(key=" + this.key + ", peopleParameter=" + this.peopleParameter + ")";
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeopleReservedKeys.values().length];
            try {
                iArr[PeopleReservedKeys.Cheater.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeopleReservedKeys.Tester.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PeopleValidatorRules() {
    }

    private final boolean peopleParameterIsBoolean(PeopleReservedKeys peopleReservedKeys, PeopleParameter peopleParameter) {
        if (peopleParameter instanceof PeopleParameterBoolean) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, "Invalid value! The [" + peopleParameter + "] value of the reserved key [" + peopleReservedKeys.getValue() + "] must be Boolean", null, 2, null);
        return false;
    }

    @Nullable
    public final String validateKey(@NotNull String method, @NotNull String key) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(key, "key");
        Bounder bounder = Bounder.INSTANCE;
        String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(key);
        String str = "The [" + strDeleteNonPrintCharacters + "] key argument";
        String strMaxStringLength = bounder.maxStringLength(method, str, strDeleteNonPrintCharacters, 64);
        if (Validator.INSTANCE.notNullOrEmpty(method, str, strMaxStringLength)) {
            return strMaxStringLength;
        }
        ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(method);
        return null;
    }

    public final boolean validateReservedValueType(@NotNull PeopleReservedKeys key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i10 != 1 && i10 != 2) {
            throw new k0();
        }
        return peopleParameterIsBoolean(key, value);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    @Nullable
    public final ValidPeopleParameter validateSet(@NotNull String method, @NotNull String key, @NotNull PeopleParameter value) {
        boolean z10;
        String str;
        PeopleParameterString peopleParameterString;
        String strMaxStringLength;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Bounder bounder = Bounder.INSTANCE;
        String strMaxStringLength2 = bounder.maxStringLength(method, "The key argument", bounder.deleteNonPrintCharacters(key), 64);
        Validator validator = Validator.INSTANCE;
        boolean zNotNullOrEmpty = validator.notNullOrEmpty(method, "The key argument", strMaxStringLength2);
        boolean z11 = value instanceof PeopleParameterLong;
        boolean z12 = false;
        if (z11) {
            if (validator.validType(method, "The value argument", Long.valueOf(((PeopleParameterLong) value).getValue())) && zNotNullOrEmpty) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11) {
                if (validator.inInterval(method, "The value argument", Long.valueOf(((PeopleParameterLong) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE) || !z10) {
                    str = method;
                } else {
                    str = method;
                    z12 = true;
                }
            } else if (value instanceof PeopleParameterDouble) {
                str = method;
                if (validator.inInterval(str, "The value argument", Double.valueOf(((PeopleParameterDouble) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE) && z10) {
                    z12 = true;
                }
            } else {
                str = method;
                if (value instanceof PeopleParameterString) {
                    peopleParameterString = (PeopleParameterString) value;
                    strMaxStringLength = bounder.maxStringLength(str, "The value argument", bounder.deleteNonPrintCharacters(peopleParameterString.getValue()), 255);
                    if (validator.notNullOrEmpty(str, "The value argument", strMaxStringLength) && z10) {
                        z12 = true;
                    }
                    if (z12) {
                        Intrinsics.checkNotNull(strMaxStringLength);
                        peopleParameterString.setValue(strMaxStringLength);
                    }
                } else {
                    if (!(value instanceof PeopleParameterBoolean)) {
                        return null;
                    }
                    z12 = z10;
                }
            }
            if (z12) {
                Intrinsics.checkNotNull(strMaxStringLength2);
                return new ValidPeopleParameter(strMaxStringLength2, value);
            }
            ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(str);
        } else if (value instanceof PeopleParameterDouble) {
            if (validator.validType(method, "The value argument", Double.valueOf(((PeopleParameterDouble) value).getValue())) && zNotNullOrEmpty) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11) {
                if (validator.inInterval(method, "The value argument", Long.valueOf(((PeopleParameterLong) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                }
                str = method;
            } else if (value instanceof PeopleParameterDouble) {
                str = method;
                if (validator.inInterval(str, "The value argument", Double.valueOf(((PeopleParameterDouble) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                    z12 = true;
                }
            } else {
                str = method;
                if (value instanceof PeopleParameterString) {
                    peopleParameterString = (PeopleParameterString) value;
                    strMaxStringLength = bounder.maxStringLength(str, "The value argument", bounder.deleteNonPrintCharacters(peopleParameterString.getValue()), 255);
                    if (validator.notNullOrEmpty(str, "The value argument", strMaxStringLength)) {
                        z12 = true;
                    }
                    if (z12) {
                        Intrinsics.checkNotNull(strMaxStringLength);
                        peopleParameterString.setValue(strMaxStringLength);
                    }
                } else {
                    if (!(value instanceof PeopleParameterBoolean)) {
                        return null;
                    }
                    z12 = z10;
                }
            }
            if (z12) {
                Intrinsics.checkNotNull(strMaxStringLength2);
                return new ValidPeopleParameter(strMaxStringLength2, value);
            }
            ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(str);
        } else if (value instanceof PeopleParameterString) {
            if (validator.validType(method, "The value argument", ((PeopleParameterString) value).getValue()) && zNotNullOrEmpty) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11) {
                if (validator.inInterval(method, "The value argument", Long.valueOf(((PeopleParameterLong) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                }
                str = method;
            } else if (value instanceof PeopleParameterDouble) {
                str = method;
                if (validator.inInterval(str, "The value argument", Double.valueOf(((PeopleParameterDouble) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                    z12 = true;
                }
            } else {
                str = method;
                if (value instanceof PeopleParameterString) {
                    peopleParameterString = (PeopleParameterString) value;
                    strMaxStringLength = bounder.maxStringLength(str, "The value argument", bounder.deleteNonPrintCharacters(peopleParameterString.getValue()), 255);
                    if (validator.notNullOrEmpty(str, "The value argument", strMaxStringLength)) {
                        z12 = true;
                    }
                    if (z12) {
                        Intrinsics.checkNotNull(strMaxStringLength);
                        peopleParameterString.setValue(strMaxStringLength);
                    }
                } else {
                    if (!(value instanceof PeopleParameterBoolean)) {
                        return null;
                    }
                    z12 = z10;
                }
            }
            if (z12) {
                Intrinsics.checkNotNull(strMaxStringLength2);
                return new ValidPeopleParameter(strMaxStringLength2, value);
            }
            ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(str);
        } else if (value instanceof PeopleParameterBoolean) {
            if (validator.validType(method, "The value argument", Boolean.valueOf(((PeopleParameterBoolean) value).getValue())) && zNotNullOrEmpty) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11) {
                if (validator.inInterval(method, "The value argument", Long.valueOf(((PeopleParameterLong) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                }
                str = method;
            } else if (value instanceof PeopleParameterDouble) {
                str = method;
                if (validator.inInterval(str, "The value argument", Double.valueOf(((PeopleParameterDouble) value).getValue()), Long.MIN_VALUE, Long.MAX_VALUE)) {
                    z12 = true;
                }
            } else {
                str = method;
                if (value instanceof PeopleParameterString) {
                    peopleParameterString = (PeopleParameterString) value;
                    strMaxStringLength = bounder.maxStringLength(str, "The value argument", bounder.deleteNonPrintCharacters(peopleParameterString.getValue()), 255);
                    if (validator.notNullOrEmpty(str, "The value argument", strMaxStringLength)) {
                        z12 = true;
                    }
                    if (z12) {
                        Intrinsics.checkNotNull(strMaxStringLength);
                        peopleParameterString.setValue(strMaxStringLength);
                    }
                } else {
                    if (!(value instanceof PeopleParameterBoolean)) {
                        return null;
                    }
                    z12 = z10;
                }
            }
            if (z12) {
                Intrinsics.checkNotNull(strMaxStringLength2);
                return new ValidPeopleParameter(strMaxStringLength2, value);
            }
            ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(str);
        }
        return null;
    }

    @NotNull
    public final List<String> validateUnset(@NotNull String method, @NotNull List<String> properties) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(properties, "properties");
        ArrayList arrayList = new ArrayList();
        for (String str : properties) {
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(str);
            String str2 = "The [" + strDeleteNonPrintCharacters + "] key of the keys array";
            String strMaxStringLength = bounder.maxStringLength(method, str2, strDeleteNonPrintCharacters, 64);
            if (Validator.INSTANCE.notNullOrEmpty(method, str2, strMaxStringLength)) {
                Intrinsics.checkNotNull(strMaxStringLength);
                arrayList.add(strMaxStringLength);
            }
        }
        return arrayList;
    }
}
