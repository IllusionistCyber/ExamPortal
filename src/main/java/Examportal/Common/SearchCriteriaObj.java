package Examportal.Common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchCriteriaObj {

    /**
     *
     */
    private static final long serialVersionUID = 9080407426651168569L;

    private int page;

    private int limit;

    private int firstLimit;

    private int endLimit;

    private int sortType;

    private String sortField;

    private String dataType;

    private Integer parentId;

    private String parentType;

    private SearchFieldsObj searchFieldsObj = null;

}
