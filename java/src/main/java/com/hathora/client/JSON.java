/*
 * Hathora Cloud API
 * Welcome to the Hathora Cloud API documentation! Learn how to use the Hathora Cloud APIs to build and scale your game servers globally.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hathora.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.AchPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ActiveConnectionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ApiError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.AppConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Application.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ApplicationWithLatestDeploymentAndBuild.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ApplicationWithLatestDeploymentAndBuildAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ApplicationWithLatestDeploymentAndBuildAllOfDeployment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ApplicationWithLatestDeploymentAndBuildAllOfDeploymentAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.AuthConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.AuthConfigurationGoogle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Build.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.BuildRegionalContainerTagsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CardPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ConnectionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ConnectionInfoV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ContainerPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateBuildParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateLobbyParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateLobbyV3Params.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateOrgToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreatePrivateLobbyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateRoomParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreateUserInvite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CreatedOrgToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.CustomerPortalUrl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Deployment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.DeploymentConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.DeploymentConfigV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.DeploymentV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.DeploymentV2EnvInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ExposedPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.GoogleIdTokenObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.InviteStatusAccepted.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.InviteStatusPending.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.InviteStatusRejected.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.InviteStatusRescinded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Invoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.LinkPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ListOrgTokens.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Lobby.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.LobbyV3.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.MetricValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.NewUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.NicknameObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.OrgInvitesPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.OrgPermission.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.OrgToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.OrganizationInviteStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.PartialCardCardPaymentMethodAchAchPaymentMethodLinkLinkPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.PickRoomExcludeKeyofRoomAllocations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.PingEndpointsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.PlayerTokenObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Process.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ProcessV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ProcessWithRooms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.ProcessWithRoomsAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.RecordPartialMetricNameMetricValueArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.RescindUserInvite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.Room.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.RoomAllocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.RoomConnectionData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.RoomConnectionDataAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.SetLobbyStateParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.StartingConnectionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.UpdateRoomConfigParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.hathora.client.model.VerificationEmailRequest.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
