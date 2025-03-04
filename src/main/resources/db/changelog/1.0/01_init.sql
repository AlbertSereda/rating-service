CREATE TABLE rating_history
(
    id            BIGSERIAL PRIMARY KEY,
    product_id    BIGINT    NOT NULL,
    rating        INT       NOT NULL CHECK (rating > 0 AND rating <= 5),
    feedback      TEXT,
    creation_date TIMESTAMP NOT NULL DEFAULT NOW()
);

COMMENT ON TABLE rating_history IS 'Historical ratings and feedback for products';
COMMENT ON COLUMN rating_history.id IS 'Unique identifier for the rating record';
COMMENT ON COLUMN rating_history.product_id IS 'Identifier of the rated product';
COMMENT ON COLUMN rating_history.rating IS 'Rating value (must be between 1 and 5)';
COMMENT ON COLUMN rating_history.feedback IS 'Optional user feedback';
COMMENT ON COLUMN rating_history.creation_date IS 'Date of the rating submission';