// Format Price

const price = 1999;
const US_CURRENCY = new Intl.NumberFormat("en-US", {
  style: "currency",
  currency: "USD",
}).format(price);

console.log(US_CURRENCY); // $1,999.00

// Format Compact Number
const views = 1500;
const compact = new Intl.NumberFormat("en-US", {
  notation: "compact",
}).format(views);

console.log(compact); // 1.5k

// Success Rate
const rate = 0.995;
const percent = new Intl.NumberFormat("en-US", {
  style: "percent",
  minimumFractionDigits: 1,
}).format(rate);

console.log(percent);
