package com.devtodev.analytics.internal.validator;

import com.devtodev.analytics.internal.logger.Logger;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Validator implements IValidator {

    @NotNull
    public static final Validator INSTANCE = new Validator();

    @Nullable
    private static Map<String, ? extends List<? extends Object>> excludedOptions;

    @Nullable
    private static Long numberOfCurrencies;

    private Validator() {
    }

    private final void isGreater(String str, String str2, Number number, Number number2) {
        Logger.INSTANCE.error(methodOccurred$DTDAnalytics_androidRelease(str2) + "\n\t" + str + " [" + number + "] is greater than the max [" + number2 + "] permitted value!", null);
    }

    private final void isLess(String str, String str2, Number number, Number number2) {
        Logger.INSTANCE.error(methodOccurred$DTDAnalytics_androidRelease(str2) + "\n\t" + str + " [" + number + "] is less than the min [" + number2 + "] permitted value!", null);
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean equalStringLength(@NotNull String method, @NotNull String argument, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (str == null || str.length() == i10) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, INSTANCE.methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + "\n\tParameter [" + str + "] length must be equal to [" + i10 + "].", null, 2, null);
        return false;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    @Nullable
    public Map<String, List<Object>> getExcludedOptions() {
        return excludedOptions;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    @Nullable
    public Long getNumberOfCurrencies() {
        return numberOfCurrencies;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean inInterval(@NotNull String method, @NotNull String argument, @NotNull Number value, @NotNull Number min, @NotNull Number max) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        try {
            if (value instanceof Double) {
                double dDoubleValue = value.doubleValue();
                if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                    Logger.INSTANCE.error(methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is [" + value + "] not supported!", null);
                    return false;
                }
                if (value.doubleValue() < ((Double) min).doubleValue()) {
                    isLess(argument, method, value, min);
                    return false;
                }
                if (value.doubleValue() > ((Double) max).doubleValue()) {
                    isGreater(argument, method, value, max);
                    return false;
                }
            } else if (value instanceof Long) {
                if (value.longValue() < ((Long) min).longValue()) {
                    isLess(argument, method, value, min);
                    return false;
                }
                if (value.longValue() > ((Long) max).longValue()) {
                    isGreater(argument, method, value, max);
                    return false;
                }
            } else if (value instanceof Integer) {
                if (value.intValue() < ((Integer) min).intValue()) {
                    isLess(argument, method, value, min);
                    return false;
                }
                if (value.intValue() > ((Integer) max).intValue()) {
                    isGreater(argument, method, value, max);
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean isAllExcluded(@Nullable Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        int i10 = 4 | 0;
        Logger.info$default(Logger.INSTANCE, "All events are excluded by project configuration", null, 2, null);
        return true;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean isExcluded(@NotNull String code, @Nullable Object obj) {
        List<Object> list;
        Intrinsics.checkNotNullParameter(code, "code");
        Map<String, List<Object>> excludedOptions2 = getExcludedOptions();
        if (excludedOptions2 == null || (list = excludedOptions2.get(code)) == null) {
            return false;
        }
        if (list.isEmpty()) {
            Logger.info$default(Logger.INSTANCE, "Event [" + code + "] is excluded by project configuration", null, 2, null);
            return true;
        }
        if (!CollectionsKt.contains(list, obj)) {
            return false;
        }
        Logger.INSTANCE.info("Event [" + code + "] with " + obj + " argument is excluded by project configuration", null);
        return true;
    }

    @NotNull
    public final String methodOccurred$DTDAnalytics_androidRelease(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return "In the " + methodName + " method an error has occurred: ";
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public <T> boolean notNull(@NotNull String method, @NotNull String argument, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (t10 != null) {
            return true;
        }
        int i10 = 5 << 2;
        Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is nil!", null, 2, null);
        return false;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean notNullOrEmpty(@NotNull String method, @NotNull String argument, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (str == null) {
            Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is nil!", null, 2, null);
            return false;
        }
        if (str.length() != 0) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is empty!", null, 2, null);
        return false;
    }

    public void setExcludedOptions(@Nullable Map<String, ? extends List<? extends Object>> map) {
        excludedOptions = map;
    }

    public void setNumberOfCurrencies(@Nullable Long l10) {
        numberOfCurrencies = l10;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public <T> boolean validType(@NotNull String method, @NotNull String argument, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (t10 == null) {
            Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is nil!", null, 2, null);
            return false;
        }
        if ((t10 instanceof Integer) || (t10 instanceof Double) || (t10 instanceof String) || (t10 instanceof Boolean) || (t10 instanceof Long)) {
            return true;
        }
        Logger.INSTANCE.error(methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " Parameter must be of valid type (Bool, Int, Long, Double, String)", null);
        return false;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean validateDoubleNAN(@NotNull String method, @NotNull String argument, double d10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (!Double.isNaN(d10)) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " \n\tParameter cannot be NAN.", null, 2, null);
        return false;
    }

    @Override // com.devtodev.analytics.internal.validator.IValidator
    public boolean notNullOrEmpty(@NotNull String method, @NotNull String argument, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(argument, "argument");
        if (map == null) {
            Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is nil!", null, 2, null);
            return false;
        }
        if (!map.isEmpty()) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, methodOccurred$DTDAnalytics_androidRelease(method) + "\n\t" + argument + " is empty!", null, 2, null);
        return false;
    }
}
