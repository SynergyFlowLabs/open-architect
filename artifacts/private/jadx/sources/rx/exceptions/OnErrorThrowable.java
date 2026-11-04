package rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes14.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        static final class Primitives {
            static final Set<Class<?>> INSTANCE = create();

            Primitives() {
            }

            private static Set<Class<?>> create() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            this.value = obj;
        }

        static String renderValue(Object obj) {
            if (obj == null) {
                return AbstractJsonLexerKt.NULL;
            }
            if (Primitives.INSTANCE.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strHandleOnNextValueRendering = RxJavaPlugins.getInstance().getErrorHandler().handleOnNextValueRendering(obj);
            if (strHandleOnNextValueRendering != null) {
                return strHandleOnNextValueRendering;
            }
            return obj.getClass().getName() + ".class";
        }

        public Object getValue() {
            return this.value;
        }
    }

    private OnErrorThrowable(Throwable th2) {
        super(th2);
        this.hasValue = false;
        this.value = null;
    }

    public static Throwable addValueAsLastCause(Throwable th2, Object obj) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        Throwable finalCause = Exceptions.getFinalCause(th2);
        if ((finalCause instanceof OnNextValue) && ((OnNextValue) finalCause).getValue() == obj) {
            return th2;
        }
        Exceptions.addCause(th2, new OnNextValue(obj));
        return th2;
    }

    public static OnErrorThrowable from(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        Throwable finalCause = Exceptions.getFinalCause(th2);
        return finalCause instanceof OnNextValue ? new OnErrorThrowable(th2, ((OnNextValue) finalCause).getValue()) : new OnErrorThrowable(th2);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    private OnErrorThrowable(Throwable th2, Object obj) {
        super(th2);
        this.hasValue = true;
        this.value = obj;
    }
}
