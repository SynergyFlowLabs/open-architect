package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.g0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes14.dex */
final class ScalarResponseBodyConverters {

    static final class BooleanResponseBodyConverter implements Converter<g0, Boolean> {
        static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Boolean convert(g0 g0Var) throws IOException {
            return Boolean.valueOf(g0Var.string());
        }
    }

    static final class ByteResponseBodyConverter implements Converter<g0, Byte> {
        static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Byte convert(g0 g0Var) throws IOException {
            return Byte.valueOf(g0Var.string());
        }
    }

    static final class CharacterResponseBodyConverter implements Converter<g0, Character> {
        static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Character convert(g0 g0Var) throws IOException {
            String strString = g0Var.string();
            if (strString.length() == 1) {
                return Character.valueOf(strString.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
        }
    }

    static final class DoubleResponseBodyConverter implements Converter<g0, Double> {
        static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Double convert(g0 g0Var) throws IOException {
            return Double.valueOf(g0Var.string());
        }
    }

    static final class FloatResponseBodyConverter implements Converter<g0, Float> {
        static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Float convert(g0 g0Var) throws IOException {
            return Float.valueOf(g0Var.string());
        }
    }

    static final class IntegerResponseBodyConverter implements Converter<g0, Integer> {
        static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Integer convert(g0 g0Var) throws IOException {
            return Integer.valueOf(g0Var.string());
        }
    }

    static final class LongResponseBodyConverter implements Converter<g0, Long> {
        static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Long convert(g0 g0Var) throws IOException {
            return Long.valueOf(g0Var.string());
        }
    }

    static final class ShortResponseBodyConverter implements Converter<g0, Short> {
        static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Short convert(g0 g0Var) throws IOException {
            return Short.valueOf(g0Var.string());
        }
    }

    static final class StringResponseBodyConverter implements Converter<g0, String> {
        static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(g0 g0Var) throws IOException {
            return g0Var.string();
        }
    }

    private ScalarResponseBodyConverters() {
    }
}
