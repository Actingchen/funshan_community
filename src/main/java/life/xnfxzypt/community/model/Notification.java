package life.xnfxzypt.community.model;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.id
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Long notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.receiver
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Long receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.outerid
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Long outerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.type
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.gmt_create
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.status
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier_name
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.outer_title
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    private String outerTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.id
     *
     * @return the value of notification.id
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.id
     *
     * @param id the value for notification.id
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier
     *
     * @return the value of notification.notifier
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Long getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier
     *
     * @param notifier the value for notification.notifier
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setNotifier(Long notifier) {
        this.notifier = notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.receiver
     *
     * @return the value of notification.receiver
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Long getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.receiver
     *
     * @param receiver the value for notification.receiver
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.outerid
     *
     * @return the value of notification.outerid
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Long getOuterid() {
        return outerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.outerid
     *
     * @param outerid the value for notification.outerid
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setOuterid(Long outerid) {
        this.outerid = outerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.type
     *
     * @return the value of notification.type
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.type
     *
     * @param type the value for notification.type
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.gmt_create
     *
     * @return the value of notification.gmt_create
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.gmt_create
     *
     * @param gmtCreate the value for notification.gmt_create
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.status
     *
     * @return the value of notification.status
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.status
     *
     * @param status the value for notification.status
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier_name
     *
     * @return the value of notification.notifier_name
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier_name
     *
     * @param notifierName the value for notification.notifier_name
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.outer_title
     *
     * @return the value of notification.outer_title
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public String getOuterTitle() {
        return outerTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.outer_title
     *
     * @param outerTitle the value for notification.outer_title
     *
     * @mbg.generated Tue Nov 10 23:06:00 CST 2020
     */
    public void setOuterTitle(String outerTitle) {
        this.outerTitle = outerTitle == null ? null : outerTitle.trim();
    }
}